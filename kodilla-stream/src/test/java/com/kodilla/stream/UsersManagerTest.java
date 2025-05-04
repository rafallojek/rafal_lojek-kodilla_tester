package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        // When
        List<String> chemists = UsersManager.filterChemistGroupUsernames();

        // Then
        assertEquals(2, chemists.size());
        assertTrue(chemists.contains("Walter White"));
        assertTrue(chemists.contains("Gale Boetticher"));
    }

    @Test
    public void testFilterUsersOlderThan() {
        // Given
        int ageLimit = 45;

        // When
        List<User> olderUsers = UsersManager.filterUsersOlderThan(ageLimit);

        // Then
        assertEquals(2, olderUsers.size());  // Walter (50), Mike (57)
        for (User user : olderUsers) {
            assertTrue(user.getAge() > ageLimit);
        }
    }

    @Test
    public void testFilterUsersOlderThan_NoMatch() {
        // Given
        int ageLimit = 100;

        // When
        List<User> result = UsersManager.filterUsersOlderThan(ageLimit);

        // Then
        assertTrue(result.isEmpty());
    }
}
