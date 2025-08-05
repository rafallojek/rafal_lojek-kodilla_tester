package com.kodilla.rest.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<String> tasks = new ArrayList<>();

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public void addTask(@RequestBody String task) {
        tasks.add(task);
    }

    @DeleteMapping
    public void removeTask(@RequestBody String task) {
        tasks.remove(task);
    }
}
