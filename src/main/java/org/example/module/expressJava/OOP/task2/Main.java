package org.example.module.expressJava.OOP.task2;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Василий");

        Animal cat = new Cat("Маруся", Feed.WET.name());
        Animal dog = new Dog("Бруклин", Feed.DRY.name());

        human.interact(dog);

    }
}
