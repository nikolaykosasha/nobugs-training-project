package org.example.module.expressJava.OOP.task6;

public class Garden {

    private Plant plant;
    private String name;

    public Garden(String name) {
        this.name = name;
    }

    public void addPlant(Plant plant) {

        if (this.plant == null) {
            this.plant = plant;
        }
    }

    public void maintenance() {
        plant.care();
    }
}
