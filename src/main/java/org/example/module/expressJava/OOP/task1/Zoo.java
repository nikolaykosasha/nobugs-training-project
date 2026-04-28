package org.example.module.expressJava.OOP.task1;

public class Zoo {
   private Animal animal;

    public void addAnimal(Animal animal) {
            this.animal = animal;
    }

    public void presentBehavior() {
        animal.behavior();
    }
}
