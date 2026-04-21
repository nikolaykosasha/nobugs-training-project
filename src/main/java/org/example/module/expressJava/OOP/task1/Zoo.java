package org.example.module.expressJava.OOP.task1;

public class Zoo {
    Animal animal;

    public void addAnimal(Animal animal) {

        if (this.animal == null) {
            this.animal = animal;
        }
    }

    public void psentBehavior() {
        animal.behavior();
    }
}
