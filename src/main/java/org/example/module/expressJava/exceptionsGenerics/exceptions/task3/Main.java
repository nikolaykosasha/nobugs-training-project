package org.example.module.expressJava.exceptionsGenerics.exceptions.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Василий", 160);

        try {
            person.validityAge(person);
        } catch (UserAgeValidityException e) {
            throw new RuntimeException(e);
        }
    }
}
