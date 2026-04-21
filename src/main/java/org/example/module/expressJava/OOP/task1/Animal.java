package org.example.module.expressJava.OOP.task1;

public abstract class Animal implements Behavaviorable {

    public void sound() {
        System.out.println("Звук");
    }

    public void move() {
        System.out.println("Передвигаться");
    }

    @Override
    public void behavior() {
        sound();
        move();
    }
}
