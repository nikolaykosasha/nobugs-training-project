package org.example.module.expressJava.OOP.task5;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void care() {
        System.out.println("Уход");
    }

    public void functions() {
        System.out.println("Функция");
    }

    public void operate() {
        care();
        functions();
    }
}
