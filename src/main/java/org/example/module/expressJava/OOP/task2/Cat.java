package org.example.module.expressJava.OOP.task2;

public class Cat extends Animal {
    private String typeEat;

    public Cat(String name, String typeEat) {
        super(name);
        this.typeEat = typeEat;
    }

    private void play() {
        System.out.println("Давай поиграем");
    }

    private void eatFood() {
        System.out.println("Ем "+ this.typeEat + " корм");
    }

    @Override
    public void care() {
        this.play();
        this.eatFood();
    }
}
