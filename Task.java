package com.example.taskmanager.model;

public class Task {
    private Long id;
    private String title;
    private boolean done;

    public Task() {}

    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
        this.done = false;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isDone() { return done; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDone(boolean done) { this.done = done; }
}
