package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.taskManager.Task;
import org.example.module.expressJava.complexTasks.taskManager.TaskManagement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskManagerTest {

    @Test
    @DisplayName("Добавление задачи")
    void addTaskTest() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Task<Integer> task = new Task<>(100, "Создана", "Высокий", LocalDate.parse("01-12-2026", formatter));
        TaskManagement taskManagement = new TaskManagement();

        int instanceSize = taskManagement.getListTask().size();
        taskManagement.addTask(task);
        int actualResult = taskManagement.getListTask().size();

        assertEquals(instanceSize + 1, actualResult);

    }

    @Test
    @DisplayName("Добавление задачи")
    void removeTaskTest() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Task<Integer> task = new Task<>(100, "Создана", "Высокий", LocalDate.parse("01-12-2026", formatter));
        TaskManagement taskManagement = new TaskManagement();

        taskManagement.addTask(task);
        int instanceSize = taskManagement.getListTask().size();
        taskManagement.removeTask(task.getID());
        int actualResult = taskManagement.getListTask().size();

        assertEquals(instanceSize - 1, actualResult);

    }

    @Test
    @DisplayName("Добавление задачи")
    void sortedTaskTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Task<Integer> task = new Task<>(100, "Создана", "Высокий", LocalDate.parse("01-12-2026", formatter));
        Task<Integer> task2 = new Task<>(101, "Создана", "Высокий", LocalDate.parse("01-11-2026", formatter));
        Task<Integer> task3 = new Task<>(102, "Создана", "Низкий", LocalDate.parse("01-11-2026", formatter));
        Task<Integer> task4 = new Task<>(103, "Закрыта", "Низкий", LocalDate.parse("01-11-2026", formatter));
        TaskManagement taskManagement = new TaskManagement();

        taskManagement.addTask(task);
        taskManagement.addTask(task2);
        taskManagement.addTask(task3);
        taskManagement.addTask(task4);

        int actualResult = taskManagement.search("Создана", "Высокий").getFirst().getID();

        assertEquals(task.getID(), actualResult);

    }


}
