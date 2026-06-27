package org.example.module.expressJava.complexTasks.taskManager;

import java.util.Date;

public class Task<T> {
    private int ID;
    private String status;
    private String priority;
    private Date date;

    public int getID() {
        return ID;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }
}
