package org.example.module.expressJava.сonditionalStatementsLoops.forLoop;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
