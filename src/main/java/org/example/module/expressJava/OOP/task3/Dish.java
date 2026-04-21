package org.example.module.expressJava.OOP.task3;

public abstract class Dish {

    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();
}
