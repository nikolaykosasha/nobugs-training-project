package org.example.module.expressJava.OOP.task5;

public class Farm {
    private String name;
    private Animal animal;

    public Farm(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public void manage() {
        animal.operate();
    }
}
