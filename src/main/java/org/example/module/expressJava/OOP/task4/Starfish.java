package org.example.module.expressJava.OOP.task4;

public class Starfish extends Creature {
    @Override
    public void move() {
        System.out.println("Ползает");
    }

    public void behavior() {
        System.out.println("Медленное");
    }

    @Override
    void care() {
        move();
        behavior();
    }
}
