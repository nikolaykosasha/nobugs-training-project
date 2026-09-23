package org.example.module.cleancode.designpatterns.task10_distance;

public class MilesToKilometersAdapter implements Distance {
    // Оборачиваем старый класс с милями (Adaptee)
    private MileSpeedometer mileSpeedometer;

    public MilesToKilometersAdapter(MileSpeedometer mileSpeedometer) {
        this.mileSpeedometer = mileSpeedometer;
    }

    // Реализуем метод целевого интерфейса и производим адаптацию (конвертацию)
    @Override
    public double getKilometers() {
        double miles = mileSpeedometer.getMileDistance();
        double kilometers = miles * 1.60934;
        return kilometers;
    }
}