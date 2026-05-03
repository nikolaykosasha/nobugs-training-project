package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.interfacesLambda.task1;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Сложение: " + addition.mathRun(23, 20));
        System.out.println("Вычитание: " + subtraction.mathRun(50, 25));
        System.out.println("Умножение: " + multiplication.mathRun(5, 5));
        System.out.println("Деление: " + division.mathRun(15, 5));
    }
}
