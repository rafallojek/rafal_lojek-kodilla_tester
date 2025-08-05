package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static volatile DbManager dbManagerInstance;

    private DbManager() {
        try {
            Properties connectionProps = new Properties();
            connectionProps.put("user", "kodilla");
            connectionProps.put("password", "kodilla");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw&useSSL=False",
                    connectionProps);
        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect to database", e);
        }
    }

    public static DbManager getInstance() {
        if (dbManagerInstance == null) {
            synchronized (DbManager.class) {
                if (dbManagerInstance == null) {
                    dbManagerInstance = new DbManager();
                }
            }
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}
