package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.universalEntityManager.EntityManager;
import org.example.module.expressJava.complexTasks.universalEntityManager.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityManagerTests {

    @Test
    void addManagerTest() {

        Student expectedResult = new Student(22, "Bob", true);
        EntityManager<Student> studentManager = new EntityManager();
        int instanceSize = studentManager.getListEntity().size();

        studentManager.add(expectedResult);

        assertEquals(instanceSize + 1, studentManager.getListEntity().size());
    }

    @Test
    void removeTest() {
        Student student = new Student(22, "Bob", true);
        EntityManager<Student> studentManager = new EntityManager();

        studentManager.add(student);
        studentManager.remove(student);
        int actualResult = studentManager.getListEntity().size();

        assertEquals(0, actualResult);
    }

    @Test
    void filterByNameTest() {
        Student student1 = new Student(22, "Bob", true);
        Student student2 = new Student(23, "Anna", true);
        Student student3 = new Student(25, "Gena", true);
        String expectedName = "Gena";
        EntityManager<Student> studentManager = new EntityManager();

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        List<Student> actualResult = studentManager.filterByName(expectedName);


        assertEquals(expectedName, actualResult.getFirst().getName());
    }
}
