package org.example.module.expressJava.OOP.ZOO;

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
