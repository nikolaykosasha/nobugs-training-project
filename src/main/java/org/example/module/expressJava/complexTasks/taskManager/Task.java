package org.example.module.expressJava.complexTasks.taskManager;

import java.time.LocalDate;

public class Task<T> {
    private T ID;
    private String status;
    private String priority;
    private LocalDate date;

    public Task(T ID, String status, String priority, LocalDate date) {
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getID() {
        return ID;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}
