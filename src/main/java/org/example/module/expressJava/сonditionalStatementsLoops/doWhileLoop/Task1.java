package org.example.module.expressJava.сonditionalStatementsLoops.doWhileLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number;

        do {
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Ввели: " + number);
    }
}