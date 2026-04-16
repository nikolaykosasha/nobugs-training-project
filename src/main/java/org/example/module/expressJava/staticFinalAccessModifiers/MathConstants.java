package org.example.module.expressJava.staticFinalAccessModifiers;

/*
Реализуйте статические методы calculateCircleArea(double r)
 — площадь круга и calculateCircumference(double r) — длина окружности.
 В main: вызовите методы с разными значениями радиуса.
 calculateExponentialGrowth(double initialValue, double rate, double time)
— расчет по формуле экспоненциального роста:
 */
public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return MathConstants.PI * (r * r);
    }

    public static double calculateCircumference(double r) {
        return 2 * MathConstants.PI * r;
    }

    public static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        double stepen = rate * time;
        double result = initialValue * Math.pow(MathConstants.E, stepen);
        return result;
    }
}
