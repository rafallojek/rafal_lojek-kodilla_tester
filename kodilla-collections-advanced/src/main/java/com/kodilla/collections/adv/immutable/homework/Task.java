package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;
    private final TaskPriority priority;

    public Task(String title, int duration, TaskPriority priority) {
        this.priority = priority;
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (duration <= 0 || duration > 10) {
            throw new IllegalArgumentException("Duration must be between 1 and 10 hours");
        }
        this.title = title.trim();
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", priority='" + priority + '\'' +
                '}';
    }
}
