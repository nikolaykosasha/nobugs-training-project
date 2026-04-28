package org.example.module.expressJava.OOP.task8;

public class AncientManuscript extends Exhibit {
    private double temperature;
    private double humidity;

    public AncientManuscript(String name, double temperature, double humidity) {
        super(name);
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void history() {
        System.out.println("История: AncientManuscript");
    }

    public void storageConditions() {
        System.out.println("Нуждается в контроле температуры и влажности");
        System.out.println("Температура: " + temperature);
        System.out.println("Влажность: " + humidity);
    }
}
