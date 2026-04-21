package org.example.module.expressJava.OOP.task3;

public class Main {
    public static void main(String[] args) {

        Dish cocacola = new Drink("Кокакола", 450);
        Dish pasta = new HotDish("Баланьезе", 36.6);

        Menu menu = new Menu();

        menu.addMenu(cocacola);
        menu.addMenu(pasta);

        menu.printMenu(pasta);
    }
}
