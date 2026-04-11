package org.example.module.expressJava.сonditionalStatementsLoops.ifElse;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = (number1 > number2) ? number1 : number2;

        System.out.println(result);
// Для заданию через ветвление
//        if (number1 > number2) {
//            System.out.println(number1);
//        } else {
//            System.out.println(number2);
//        }
    }
}
