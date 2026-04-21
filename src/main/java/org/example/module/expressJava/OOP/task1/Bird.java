package org.example.module.expressJava.OOP.task1;

public class Bird extends Animal {

    @Override
    public void sound() {
        System.out.println("чирикает");
    }

    @Override
    public void move() {
        System.out.println("летает");
    }
}
