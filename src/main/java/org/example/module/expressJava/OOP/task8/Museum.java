package org.example.module.expressJava.OOP.task8;

public class Museum {
    private String name;
    private Exhibit exhibit;

    public Museum(String name, Exhibit exhibit) {
        this.name = name;
        this.exhibit = exhibit;
    }

    public void printHistory() {
        exhibit.history();
    }

    public void storageConditions() {
        exhibit.storageConditions();
    }
}
