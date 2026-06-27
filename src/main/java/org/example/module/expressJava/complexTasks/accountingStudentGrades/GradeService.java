package org.example.module.expressJava.complexTasks.accountingStudentGrades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeService <T extends Number>{
    private List<StudentGrade<T>> gradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade studentGrade) {
        checkedAssessment(studentGrade);
        gradeList.add(studentGrade);
    }

    public double averageRating(String subject) {
        return gradeList.stream()
                .filter(s -> s.getSubject().equals(subject))
                .mapToDouble(s -> s.getAssessment().doubleValue())
                .average()
                .orElse(0.0);
    }

    private void checkedAssessment(StudentGrade studentGrade) {

        if (studentGrade.getAssessment().intValue() < 0) {
            throw new InvalidGradeException("Оценка должна быть больше 0");
        }
    }



}
