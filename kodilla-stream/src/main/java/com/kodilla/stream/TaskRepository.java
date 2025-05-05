package com.kodilla.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTaskList() {
        return Arrays.asList(
                new Task("Buy flowers", "LOW", false, LocalDate.now().plusDays(1)),
                new Task("Clean the garage", "MEDIUM", true, LocalDate.now().plusDays(3)),
                new Task("Finish Java project", "HIGH", false, LocalDate.now().plusDays(2)),
                new Task("Read a book ISTQB", "LOW", false, LocalDate.now().plusDays(5)),
                new Task("Pay bill telephone", "HIGH", true, LocalDate.now().plusDays(1)),
                new Task("Learn the next module of the Kodilla course", "HIGH", false, LocalDate.now().plusDays(3))
        );
    }
}
