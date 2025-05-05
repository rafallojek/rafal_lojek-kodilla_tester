package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testGetHighPriorityPendingTasksDueInNext3Days() {
        // Given

        // When
        List<String> result = TaskManager.getHighPriorityPendingTasksDueInNext3Days();

        // Then
        assertEquals(2, result.size());
        assertEquals("Finish Java project", result.get(0));
        assertEquals("Learn the next module of the Kodilla course", result.get(1));
    }
}
