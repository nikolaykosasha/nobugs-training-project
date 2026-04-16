package org.example.module.expressJava.staticFinalAccessModifiers;
/*
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName Реализуйте конструктор для studentID и studentName,
статический метод changeUniversityName(String newName),
геттер для studentName, метод printStudentInfo() — выводит имя, ID и университет.
В main: создайте 3 студента, измените название университета и выведите данные.
 */
public class University {
    private static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Имя: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Университет: " + universityName);
    }


}
