package org.example.module.expressJava.exceptionsGenerics.exceptions.task3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean validityAge(Person person) throws UserAgeValidityException {
        if (this.age < 0 || this.age > 150) {
            throw new UserAgeValidityException("Возраст не может быть меньше 0 или больше 150");
        }
        return true;
    }
}
