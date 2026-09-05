package org.example.module.cleancode.designpatterns.task4_factorymethodweapon;

public class CreateBow extends FactoryWeapon {

    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}
