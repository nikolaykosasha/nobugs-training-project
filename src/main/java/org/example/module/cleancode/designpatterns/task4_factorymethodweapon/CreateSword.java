package org.example.module.cleancode.designpatterns.task4_factorymethodweapon;

public class CreateSword extends FactoryWeapon {

    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
