package org.example.module.expressJava.OOP.task2;

public class Dog extends Animal {

    private String typeEat;

    public Dog(String name, String typeEat) {
        super(name);
        this.typeEat = typeEat;
    }

    private void walk() {
        System.out.println("Давай погуляем");
    }

    private void eatFood() {
        System.out.println("Ем " + this.typeEat + " корм");
    }

    @Override
    public void care() {
        this.walk();
        this.eatFood();
    }
}
