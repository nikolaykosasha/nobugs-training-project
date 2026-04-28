package org.example.module.expressJava.OOP.task6;

public class Main {
    public static void main(String[] args) {

        Plant cactus = new Cactus("Звездочка");
        Plant cactusBig = new Cactus("Большой кактус");
        Plant orchid = new Orchid("Желтый");

        Garden garden = new Garden("Белый сад");

        garden.addPlant(cactusBig);

        garden.maintenance();

        garden.addPlant(orchid);
        garden.maintenance();
    }
}
