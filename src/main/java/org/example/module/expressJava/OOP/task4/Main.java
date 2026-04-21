package org.example.module.expressJava.OOP.task4;

public class Main {
    public static void main(String[] args) {

        Creature shark = new Shark();
        Aquarium aquarium = new Aquarium("Аквариум: Тигровой акулы", shark);

        aquarium.interact();
    }
}
