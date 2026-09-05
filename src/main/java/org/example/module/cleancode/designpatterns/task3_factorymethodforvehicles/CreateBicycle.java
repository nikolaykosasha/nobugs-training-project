package org.example.module.cleancode.designpatterns.task3_factorymethodforvehicles;

public class CreateBicycle extends CreateTransport {

    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
