package org.example.module.expressJava.OOP.task6;

public class Orchid extends Plant {

    public Orchid(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("Нуждается в тени и высокой влажности");
    }
}
