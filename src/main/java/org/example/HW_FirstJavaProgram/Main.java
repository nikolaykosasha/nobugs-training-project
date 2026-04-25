package org.example.HW_FirstJavaProgram;

public class Main {
    public static void main(String[] args) {

        /*
         * Задание 1
         * В main вызовите каждый метод с произвольными числами и выведите результат.
         * add(int x, int y) — возвращает сумму двух чисел
         * subtract(int x, int y) — разницу
         * multiply(int x, int y) — произведение
         * divide(int x, int y) — результат деления в double
         */

        System.out.println("Cумма двух чисел: " + MathOperations.add(4, 5));
        System.out.println("Разница двух чисел: " + MathOperations.subtract(7, 9));
        System.out.println("Произведение двух чисел: " + MathOperations.multiply(9, 9));
        System.out.println("Деление двух чисел: " + MathOperations.divide(27, 9));

        /*
         * Задание 2
         * Реализуйте метод для нахождения максимума двух чисел
         *    Условие:
         *    Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
         *    Вызовите метод в main и выведите результат.
         */
        System.out.println("Максимальное значение: " + MathOperations.findMax(7, 4));
        System.out.println("Максимальное значение: " + MathOperations.findMax(1, 9));
        System.out.println("Максимальное значение: " + MathOperations.findMax(7, 7));

        /*
         * Задание 3
         * Метод для нахождения разницы между двумя числами
         *    Условие:
         *    Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
         *    Проверьте метод в main.
         */
        System.out.println("Модуль разности двух чисел: " + MathOperations.difference(5, 2));
        System.out.println("Модуль разности двух чисел: " + MathOperations.difference(14, 16));

        /*
         * Задание 4
         * Методы для площади и периметра квадрата
         *    Условие:
         *    Создайте два метода:
         *    squareArea(int side) — возвращает площадь квадрата
         *    squarePerimeter(int side) — возвращает периметр
         *    Вызовите оба метода в main с примером.
         */

        System.out.println("Площадь квадрата: " + MathOperations.squareArea(5));
        System.out.println("Периметр квадрата: " + MathOperations.squarePerimeter(5));

        /*
         * Задание 5
         * Метод для перевода секунд в минуты
         *    Условие:
         *    Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
         *    Вызовите метод в main и выведите результат.
         */

        System.out.println("Количество минут: " + MathOperations.convertSecondsToMinutes(50));
        System.out.println("Количество минут: " + MathOperations.convertSecondsToMinutes(60));
        System.out.println("Количество минут: " + MathOperations.convertSecondsToMinutes(600));

        /*
         * Задание 6
         * Метод для вычисления средней скорости
         *    Условие:
         *    Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
         *    Вызовите метод с разными значениями.
         */
        System.out.println("Средняя скорость: " + MathOperations.averageSpeed(620, 200));
        System.out.println("Средняя скорость: " + MathOperations.averageSpeed(6.2, 60));

        /*
         * Задание 7
         * Метод для нахождения гипотенузы
         * Условие:
         * Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора: √(a² + b²)
         * Вызовите метод с несколькими наборами чисел.
         */

        System.out.println("Гипотенуза = " + MathOperations.findHypotenuse(5, 6));

        /*
        Задание 8
        Метод для длины окружности
        Условие:
        Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
        Проверьте работу на нескольких значениях.
         */

        System.out.println("Длина окружности = " + MathOperations.circleCircumference(6.6));

        /*
        Задание 9
        Метод для вычисления процентов
        Условие:
        Создайте метод calculatePercentage(double total, double part) — возвращает,
         какой процент от общего составляет часть.
        Пример: 25 из 200 → 12.5%
         */

        System.out.println("Вычисление процентов: " + MathOperations.calculatePercentage(200,25));

        /*
        Задание 10
        Методы перевода температуры
        Условие:
        Создайте два метода:
        celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
        fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
        Проверьте оба метода в main.
         */

        System.out.println("Фаренгейт = " + MathOperations.celsiusToFahrenheit(25));
        System.out.println("Цельсий = " + MathOperations.fahrenheitToCelsius(225));

    }
}
