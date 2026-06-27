package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.accountingStudentGrades.GradeService;
import org.example.module.expressJava.complexTasks.accountingStudentGrades.InvalidGradeException;
import org.example.module.expressJava.complexTasks.accountingStudentGrades.StudentGrade;
import org.example.module.expressJava.complexTasks.userDataValidator.InvalidUserException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountingStudentGradesTests {

    @Test
    void addStudentTest() {

        StudentGrade studentGrade1 = new StudentGrade<>("Вася", "Музыка", 80);
        GradeService gradeService = new GradeService();
        int instanceSize = gradeService.getGradeList().size();

        gradeService.addGrade(studentGrade1);

        assertEquals(instanceSize + 1, gradeService.getGradeList().size());
    }

    @Test
    void averageRatingTest() {
        StudentGrade studentGrade1 = new StudentGrade<>("Вася", "Музыка", 80);
        StudentGrade studentGrade2 = new StudentGrade<>("Миша", "Музыка", 70);
        StudentGrade studentGrade3 = new StudentGrade<>("Миша", "Математика", 90);
        GradeService gradeService = new GradeService();

        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);

        double actualResult = gradeService.averageRating("Музыка");

        assertEquals(75.0, actualResult);
    }

    @Test
    void checkedAssessmentTest() {
        StudentGrade studentGrade1 = new StudentGrade<>("Вася", "Музыка", -10);
        GradeService gradeService = new GradeService();

        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(studentGrade1);
        });
    }
}
