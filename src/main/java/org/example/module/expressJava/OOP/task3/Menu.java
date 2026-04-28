package org.example.module.expressJava.OOP.task3;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> menu;

    public void addMenu(Dish dish) {
        if(menu == null) {
            menu = new ArrayList<>();
        }
        menu.add(dish);
    }

    public void printMenu() {
        for (Dish m : menu){
            m.print();
        }
    }
}
