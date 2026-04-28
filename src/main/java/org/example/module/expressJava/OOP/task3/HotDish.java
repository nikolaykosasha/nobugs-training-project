package org.example.module.expressJava.OOP.task3;

public class HotDish extends Dish {
    private double temperature;

    public HotDish(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }
    @Override
    public void print() {
        System.out.println("Название: " + this.getName() + " Температура: " + this.getTemperature());
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
