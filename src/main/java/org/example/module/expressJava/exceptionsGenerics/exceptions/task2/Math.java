package org.example.module.expressJava.exceptionsGenerics.exceptions.task2;

public class Math {
    private int aInt;
    private int bInt;

    public int division(int a, int b) {

        int result;
        {
            try {
                result = a / b;
            } catch (ArithmeticException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
}
