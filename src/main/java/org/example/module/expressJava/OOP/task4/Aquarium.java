package org.example.module.expressJava.OOP.task4;

public class Aquarium {

    String name;
    Creature creature;

    public Aquarium(String name, Creature creature) {
        this.name = name;
        this.creature = creature;
    }

    public void interact() {
        creature.care();
    }
}
