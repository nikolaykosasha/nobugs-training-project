package org.example.module.expressJava.OOP.task2;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void interact(Animal animal) {
        animal.care();
    }
}
