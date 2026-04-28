package org.example.module.expressJava.OOP.task7;

public class Carousel extends Attraction {
    public Carousel(String name) {
        super(name);
    }

    @Override
    public void properties() {
        System.out.println("Требуют частого технического обслуживания");
    }
}
