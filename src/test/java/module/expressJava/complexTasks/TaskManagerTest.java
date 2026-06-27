package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.taskManager.Task;
import org.example.module.expressJava.complexTasks.taskManager.TaskManagement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {

    @Test
    @DisplayName("Добавление задачи")
    void addTaskTest() {

        Task task = new Task<>(100, "Создана", "Высокий", "01-12-2026");
        TaskManagement taskManagement = new TaskManagement();

        int instanceSize = taskManagement.getListTask().size();
        taskManagement.addTask(task);
        int actualResult = taskManagement.getListTask().size();

        assertEquals(instanceSize + 1, actualResult);

    }

    @Test
    @DisplayName("Добавление задачи")
    void removeTaskTest() {

        Task task = new Task<>(100, "Создана", "Высокий", "01-12-2026");
        TaskManagement taskManagement = new TaskManagement();

        taskManagement.addTask(task);
        int instanceSize = taskManagement.getListTask().size();
        taskManagement.removeTask(task);
        int actualResult = taskManagement.getListTask().size();

        assertEquals(instanceSize - 1, actualResult);

    }

    @Test
    @DisplayName("Добавление задачи")
    void sortedTaskTest() {

        Task task = new Task<>(100, "Создана", "Высокий", "01-12-2026");
        Task task2 = new Task<>(101, "Создана", "Высокий", "01-11-2026");
        Task task3 = new Task<>(102, "Создана", "Низкий", "01-11-2026");
        Task tas4 = new Task<>(103, "Закрыта", "Низкий", "01-11-2026");
        TaskManagement taskManagement = new TaskManagement();

        taskManagement.addTask(task);
        taskManagement.addTask(task2);
        taskManagement.addTask(task3);
        taskManagement.addTask(tas4);

        int actualResult = taskManagement.search("Создана", "Высокий").getFirst().getID();

        assertEquals(task.getID(), actualResult);

    }


}
