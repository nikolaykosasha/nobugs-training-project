package org.example.module.expressJava.OOP.task5;

public class Main {

    public static void main(String[] args) {

        Animal cow = new Cow("Марфа");
        Animal chicken = new Chicken("Ряба");

        Farm ferma = new Farm("Будапешская ферма", cow);

        ferma.manage();
    }
}
