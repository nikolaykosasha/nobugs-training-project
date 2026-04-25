package org.example.module.expressJava.classesAndObjects;

public class StudentGroup {

    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo() {
        System.out.println("Название группы: " + groupName);
        System.out.println("Количество учеников: " + studentCount);
    }
}
