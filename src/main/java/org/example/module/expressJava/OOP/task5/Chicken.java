package org.example.module.expressJava.OOP.task5;

public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Требует корм с зерном");
    }

    @Override
    public void functions() {
        System.out.println("Несёт яйца");
    }
}
