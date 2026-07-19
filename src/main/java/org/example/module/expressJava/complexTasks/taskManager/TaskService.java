package org.example.module.expressJava.complexTasks.taskManager;

import java.util.List;

public interface TaskService<T> {

    void addTask(Task<T> task);
    void removeTask(T id);
    List<Task<T>> search(String status, String priority);
}