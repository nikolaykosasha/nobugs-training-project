package org.example.module.expressJava.complexTasks.accountingStudentGrades;

public class StudentGrade<T extends Number> {
    private String name;
    private String subject;
    private T assessment;

    public StudentGrade(String name, String subject, T assessment) {
        this.name = name;
        this.subject = subject;
        this.assessment = assessment;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public T getAssessment() {
        return assessment;
    }
}
