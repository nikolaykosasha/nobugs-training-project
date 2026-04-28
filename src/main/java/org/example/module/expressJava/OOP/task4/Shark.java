package org.example.module.expressJava.OOP.task4;

public class Shark extends Creature {

    @Override
    public void move() {
        System.out.println("Плавает");
    }

    private void behavior() {
        System.out.println("Агрессивное");
    }

    @Override
    public void care() {
        move();
        behavior();
    }
}
