package org.example.module.cleancode.designpatterns.task3_factorymethodforvehicles;

public class CreateCar extends CreateTransport {
    @Override
    Transport createTransport() {
        return new Car();
    }
}
