package org.example.module.cleancode.designpatterns.task10_distance;

public class KillometrAdapter {
    private MileSpeedometer mileSpeedometer;

    public KillometrAdapter(MileSpeedometer mileSpeedometer) {
        this.mileSpeedometer = mileSpeedometer;
    }

    public double getKillometr() {
        double mTemp = mileSpeedometer.getMileDistance();
        double kTemp = mTemp * 1.60934;
        return kTemp;
    }
}
