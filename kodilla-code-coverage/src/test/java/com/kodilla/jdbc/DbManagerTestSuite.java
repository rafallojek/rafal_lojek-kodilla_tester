package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // Given
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(
                "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('TestFirst', 'TestLast')");
        ResultSet rs = statement.executeQuery(
                "SELECT ID FROM USERS WHERE FIRSTNAME = 'TestFirst' AND LASTNAME = 'TestLast' ORDER BY ID DESC LIMIT 1");
        int testUserId = -1;
        if(rs.next()) {
            testUserId = rs.getInt("ID");
        }

        statement.executeUpdate(
                "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+testUserId+", 'Test Post 1')");
        statement.executeUpdate(
                "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+testUserId+", 'Test Post 2')");

        // When
        String sql = "SELECT USERS.FIRSTNAME, USERS.LASTNAME " +
                "FROM USERS JOIN POSTS ON USERS.ID = POSTS.USER_ID " +
                "GROUP BY USERS.ID " +
                "HAVING COUNT(POSTS.ID) >= 2";
        rs = statement.executeQuery(sql);

        // Then
        int counter = 0;
        boolean testUserFound = false;
        while(rs.next()) {
            String firstname = rs.getString("FIRSTNAME");
            String lastname = rs.getString("LASTNAME");
            System.out.println(firstname + " " + lastname);
            if(firstname.equals("TestFirst") && lastname.equals("TestLast")) {
                testUserFound = true;
            }
            counter++;
        }

        Assertions.assertTrue(testUserFound, "The test user should be on the this list");
        statement.executeUpdate("DELETE FROM POSTS WHERE USER_ID = " + testUserId);
        statement.executeUpdate("DELETE FROM USERS WHERE ID = " + testUserId);
        rs.close();
        statement.close();
    }
}