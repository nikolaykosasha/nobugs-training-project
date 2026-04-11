package org.example.module.expressJava.сonditionalStatementsLoops.ifElse;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}
