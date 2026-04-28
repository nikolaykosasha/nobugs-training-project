package org.example.module.expressJava.OOP.task6;

public class Cactus extends Plant{

    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Требует много света и редкого полива");
    }
}
