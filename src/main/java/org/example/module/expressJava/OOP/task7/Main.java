package org.example.module.expressJava.OOP.task7;

public class Main {
    public static void main(String[] args) {

        Attraction attraction = new Carousel("Карусель");
        Attraction roller = new RollerCoaster("Роллер");
        Park park = new Park("Железный парк");

        park.conditionRides(attraction);
    }
}
