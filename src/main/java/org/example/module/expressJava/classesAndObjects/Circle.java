package org.example.module.expressJava.classesAndObjects;

public class Circle {

    private double radius;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
    calculateArea() и calculateCircumference().
    В main измените радиус, выведите площадь и длину окружности.
     */

    public void calculateArea() {
        double S = Math.PI * (radius * radius);
        System.out.println("Площадь = " + S);
    }

    public void calculateCircumference() {
        double C = 2 * Math.PI * radius;
        System.out.println("Длина окружности = " + C);
    }
}
