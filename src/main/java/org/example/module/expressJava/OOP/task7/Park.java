package org.example.module.expressJava.OOP.task7;

public class Park {
    private String name;
    private Attraction attraction;

    public Park(String name) {
        this.name = name;
    }

    public void conditionRides(Attraction attraction) {
        attraction.getName();
        attraction.properties();
    }

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }
}
