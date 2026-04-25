package org.example.module.expressJava.classesAndObjects;

public class Car {
    /*
    Класс Car
Создайте класс Car с полями brand (строка) и year (целое число).
Реализуйте конструктор с двумя параметрами,
 геттеры и сеттеры для обоих полей, метод print(),
 выводящий информацию о марке и годе выпуска. В main создайте объект
, установите значения через конструктор,
измените год через сеттер, выведите информацию.
     */

    private int year;
    private String brand;

    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print() {
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Год выпуска автомобиля: " + year);
    }
}
