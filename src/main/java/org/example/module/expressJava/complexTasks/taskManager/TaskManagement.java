package org.example.module.expressJava.complexTasks.taskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManagement implements TaskService<Integer> {

    private List<Task<Integer>> listTask = new ArrayList<>();

    public List<Task<Integer>> getListTask() {
        return listTask;
    }

    @Override
    public void addTask(Task<Integer> task) {
        listTask.add(task);
    }

    @Override
    public void removeTask(Integer id) {
        listTask.removeIf(t -> t.getID().equals(id));
    }

    @Override
    public List<Task<Integer>> search(String status, String priority) {

        return listTask.stream()
                .filter(t -> t.getStatus().equals(status))
                .filter(t -> t.getPriority().equals(priority))
                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .toList();
    }
}