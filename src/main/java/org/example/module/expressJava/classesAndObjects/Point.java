package org.example.module.expressJava.classesAndObjects;
/*
Создайте класс Point с координатами x и y.
Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
В main измените x, выведите новые координаты.
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Координата X = " + x);
        System.out.println("Координата Y = " + y);
    }
}
