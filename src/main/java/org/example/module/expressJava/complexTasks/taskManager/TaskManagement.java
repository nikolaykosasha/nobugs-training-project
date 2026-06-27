package org.example.module.expressJava.complexTasks.taskManager;

import java.util.List;

public class TaskManagement implements TaskService {
    private List<Task> listTask;

    @Override
    public void addTask(Task task) {
        listTask.add(task);
    }

    @Override
    public void removeTask(Task task) {
        listTask.remove(task);
    }

    @Override
    public List<Task> search(String status, String priority) {

        return listTask.stream()
                .filter(t -> t.getStatus().equals(status))
                .filter(t -> t.getPriority().equals(priority))
                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .toList();
    }
}
