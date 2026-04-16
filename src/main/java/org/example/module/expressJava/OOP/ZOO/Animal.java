package org.example.module.expressJava.OOP.ZOO;

public class Animal implements Zoo{

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
