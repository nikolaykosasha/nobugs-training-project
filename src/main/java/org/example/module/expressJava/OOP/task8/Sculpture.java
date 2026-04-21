package org.example.module.expressJava.OOP.task8;

public class Sculpture extends Exhibit {
    private boolean needRestoration;

    public Sculpture(String name, boolean needRestoration) {
        super(name);
        this.needRestoration = needRestoration;

    }

    @Override
    public void history() {
        System.out.println("История: Sculpture");
    }

    @Override
    public void storageConditions() {
        System.out.println("Требует регулярной реставрации");
        System.out.println("Нужна реставрации: " + needRestoration);
    }
}
