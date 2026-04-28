package org.example.module.expressJava.OOP.task5;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Нуждается в выпасе");
    }

    @Override
    public void functions() {
        System.out.println("Даёт молоко");
    }
}
