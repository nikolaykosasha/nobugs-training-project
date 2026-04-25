package org.example.module.expressJava.classesAndObjects;

public class Teacher {

    private String name;
    private String subject;

    public Teacher() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Название = " + name);
        System.out.println("Предмет = " + subject);
    }
}
