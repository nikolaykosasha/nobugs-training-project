package org.example.module.expressJava.complexTasks.taskManager;

import java.util.Date;

public class Task<T> {
    private int ID;
    private String status;
    private String priority;
    private String date;

    public Task(int ID, String status, String priority, String date) {
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public String getDate() {
        return date;
    }
}
