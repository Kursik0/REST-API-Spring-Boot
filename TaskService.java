package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {

    private final Map<Long, Task> tasks = new HashMap<>();
    private Long idCounter = 1L;

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task createTask(Task task) {
        task.setId(idCounter++);
        tasks.put(task.getId(), task);
        return task;
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setTitle(updatedTask.getTitle());
            return task;
        }
        return null;
    }

    public boolean deleteTask(Long id) {
        return tasks.remove(id) != null;
    }

    public Task markDone(Long id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setDone(true);
        }
        return task;
    }
}
