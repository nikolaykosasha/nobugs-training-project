package org.example.module.cleancode.designpatterns.task10_distance;

public class Kilometers implements Distance {
    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getKilometers() {
        return kilometers;
    }
}