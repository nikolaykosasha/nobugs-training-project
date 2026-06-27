package org.example.module.expressJava.complexTasks.accountingStudentGrades;

public class Main {

    public static void main(String[] args) {
        StudentGrade studentGrade1 = new StudentGrade<>("Вася", "Музыка", 80);
        StudentGrade studentGrade2 = new StudentGrade<>("Миша", "Музыка", 5.0);
        StudentGrade studentGrade3 = new StudentGrade<>("Миша", "Математика", 90);
        GradeService gradeService = new GradeService();

        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);


        System.out.println(gradeService.averageRating("Музыка"));
    }
}
