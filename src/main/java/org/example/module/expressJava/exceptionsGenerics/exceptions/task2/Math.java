package org.example.module.expressJava.exceptionsGenerics.exceptions.task2;

public class Math {
    private int aInt;
    private int bInt;

    public int division(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль невозможно");
            return 0;
        }
    }
}
