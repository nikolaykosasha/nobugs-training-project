package org.example.module.expressJava.firstJavaProgram;

public class MathOperations {

    /**
     * add(int x, int y) — возвращает сумму двух чисел
     * subtract(int x, int y) — разницу
     * multiply(int x, int y) — произведение
     * divide(int x, int y) — результат деления в double
     */

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / y;
    }

    /**
     * Метод findMax(int a, int b), возвращает большее из двух чисел
     * @param a
     * @param b
     * @return
     */
    public static int findMax(int a, int b) {
        return (a > b ? a : b);
    }

    /**
     * Метод difference(int x, int y), возвращает модуль разности двух чисел
     * @param x
     * @param y
     * @return
     */
    public static int difference(int x, int y) {
        int subtract = subtract(x, y);

        return Math.abs(subtract);
    }

    /**
     * Возвращает площадь квадрата
     * @param side
     * @return squareArea
     */
    public static int squareArea(int side) {
        return multiply(side, side);
    }

    /**
     * Возвращает периметр
     * @param side
     * @return
     */
    public static int squarePerimeter(int side) {
        return side * 4;
    }

    /**
     * возвращает количество минут (целых или дробных).
     * @param seconds
     * @return
     */
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    /**
     * Возвращает среднюю скорость (distance / time)
     * @param distance
     * @param time
     * @return
     */
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    /**
     * Вычисления гипотенузы по теореме Пифагора
     * @param a
     * @param b
     * @return
     */
    public static double findHypotenuse(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Стороны треугольника не могут быть отрицательными");
        }

        return Math.sqrt(a * a + b * b);
    }

    /**
     * Возвращает длину окружности по формуле 2πr
     * @param radius
     * @return
     */
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Возвращает, какой процент от общего составляет часть
     * @param total
     * @param part
     * @return
     */
    public static double calculatePercentage(double total, double part) {
        if (total <= 0) {
            throw new IllegalArgumentException("Аргумент долженб быть больше 0");
        }

        return (part / total) * 100;
    }

    /**
     * Перевод в Фаренгейты
     * @param c
     * @return
     */
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    /**
     * Перевод в Цельсий
     * @param f
     * @return
     */
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }



}
