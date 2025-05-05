package com.kodilla.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static List<String> getHighPriorityPendingTasksDueInNext3Days() {
        return TaskRepository.getTaskList()
                .stream()
                .filter(task -> !task.isCompleted())
                .filter(task -> task.getPriority().equals("HIGH"))
                .filter(task -> !task.getDueDate().isAfter(LocalDate.now().plusDays(3)))
                .sorted((t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()))
                .map(Task::getDescription)
                .collect(Collectors.toList());
    }
}
