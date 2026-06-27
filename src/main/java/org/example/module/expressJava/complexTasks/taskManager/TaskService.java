package org.example.module.expressJava.complexTasks.taskManager;

import java.util.List;

public interface TaskService<T> {

    void addTask(Task task);
    void removeTask(Task task);
    List<Task> search(String status, String priority);
}
