package org.example.module.cleancode.designpatterns.task4_factorymethodweapon;

public class CreateGun extends FactoryWeapon {
    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
