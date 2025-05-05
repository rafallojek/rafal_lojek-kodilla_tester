package com.kodilla.stream;

import java.time.LocalDate;

public class Task {
    private String description;
    private String priority; // "HIGH", "MEDIUM", "LOW"
    private boolean isCompleted;
    private LocalDate dueDate;

    public Task(String description, String priority, boolean isCompleted, LocalDate dueDate) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
