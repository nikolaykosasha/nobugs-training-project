package org.example.module.expressJava.сonditionalStatementsLoops.forLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number - 1; i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }
        System.out.println("Число простое: " + isPrime);
    }
}
