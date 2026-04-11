package org.example.module.expressJava.сonditionalStatementsLoops.taskSwitch;

import org.example.module.expressJava.firstJavaProgram.MathOperations;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите два числа и арифметические оператор: ");
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        String operator = scanner.next();


        if (numberB != 0) {
            switch (operator) {
                case "+" -> System.out.println(MathOperations.add(numberA, numberB));
                case "-" -> System.out.println(MathOperations.subtract(numberA, numberB));
                case "*" -> System.out.println(MathOperations.multiply(numberA, numberB));
                case "/" -> System.out.println(MathOperations.divide(numberA, numberB));// Java автоматически приведет к double
                default -> System.out.println("Нет оператора");
            }
        }


    }
}
