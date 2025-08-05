package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    void shouldCreateTaskWithPriority() {
        // given & when
        Task task = new Task("Homework", 7, TaskPriority.MEDIUM);

        // then
        assertEquals("Homework", task.getTitle());
        assertEquals(7, task.getDuration());
        assertEquals(TaskPriority.MEDIUM, task.getPriority());
    }
}
