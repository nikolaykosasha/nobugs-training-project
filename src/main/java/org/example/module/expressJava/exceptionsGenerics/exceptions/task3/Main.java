package org.example.module.expressJava.exceptionsGenerics.exceptions.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Василий", 160);

        try {
            person.validityAge();
        } catch (UserAgeValidityException e) {
            System.out.println(e.getMessage());;
        }
    }
}
