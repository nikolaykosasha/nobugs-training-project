package org.example.module.expressJava.classesAndObjects;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - discount;
    }

    public void printInfo() {
        System.out.println("Название продукта = " + name);
        System.out.println("Цена продукта = " + price);
    }
}
