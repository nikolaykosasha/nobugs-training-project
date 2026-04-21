package org.example.module.expressJava.OOP.task3;

public class Drink extends Dish {
    private int volume;

    public Drink(String name, int volume) {
        super(name);
        this.volume = volume;

    }
    @Override
    public void print() {
        System.out.println("Название: " + this.getName() + " Объем: " + this.getVolume());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
