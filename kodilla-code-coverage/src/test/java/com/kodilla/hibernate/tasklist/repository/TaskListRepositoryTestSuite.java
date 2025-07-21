package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("ToDo", "Tasks to be completed");
        taskListRepository.save(taskList);

        // When
        List<TaskList> result = taskListRepository.findByListName("ToDo");

        // Then
        assertEquals(1, result.size());
        assertEquals("ToDo", result.get(0).getListName());
        assertEquals("Tasks to be completed", result.get(0).getDescription());

        // CleanUp
        taskListRepository.deleteAll();
    }
}
