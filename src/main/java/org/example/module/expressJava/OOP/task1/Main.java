package org.example.module.expressJava.OOP.task1;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        zoo.addAnimal(bird);

        zoo.psentBehavior();

        zoo.addAnimal(elephant);
        zoo.psentBehavior();
    }


}
