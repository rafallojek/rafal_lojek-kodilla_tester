package com.kodilla.stream.homework;

import com.kodilla.stream.UserForumStats;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    @Test
    void testAveragePostsForUsersOver40() {
        // Given
        List<UserForumStats> testUsers = Arrays.asList(
                new UserForumStats("User1", 45, 10, "Test"),
                new UserForumStats("User2", 50, 20, "Test"),
                new UserForumStats("User3", 35, 100, "Test")
        );

        // When
        double result = ForumStats.averagePostsForUsersOver40(testUsers);

        // Then
        assertEquals(15.0, result, 0.01);
    }

    @Test
    void testAveragePostsForUsersUnder40() {
        // Given
        List<UserForumStats> testUsers = Arrays.asList(
                new UserForumStats("User1", 25, 30, "Test"),
                new UserForumStats("User2", 38, 60, "Test"),
                new UserForumStats("User3", 41, 90, "Test")
        );

        // When
        double result = ForumStats.averagePostsForUsersUnder40(testUsers);

        // Then
        assertEquals(45.0, result, 0.01);
    }

    @Test
    void testNoUsersOver40() {
        // Given
        List<UserForumStats> testUsers = Arrays.asList(
                new UserForumStats("User1", 20, 30, "Test"),
                new UserForumStats("User2", 39, 60, "Test")
        );

        // When
        double result = ForumStats.averagePostsForUsersOver40(testUsers);

        // Then
        assertEquals(0.0, result, 0.01);
    }

    @Test
    void testNoUsersUnder40() {
        // Given
        List<UserForumStats> testUsers = Arrays.asList(
                new UserForumStats("User1", 40, 30, "Test"),
                new UserForumStats("User2", 50, 60, "Test")
        );

        // When
        double result = ForumStats.averagePostsForUsersUnder40(testUsers);

        // Then
        assertEquals(0.0, result, 0.01);
    }

    @Test
    void testEmptyUserList() {
        // Given
        List<UserForumStats> testUsers = Collections.emptyList();

        // When
        double resultOver40 = ForumStats.averagePostsForUsersOver40(testUsers);
        double resultUnder40 = ForumStats.averagePostsForUsersUnder40(testUsers);

        // Then
        assertEquals(0.0, resultOver40, 0.01);
        assertEquals(0.0, resultUnder40, 0.01);
    }
}
