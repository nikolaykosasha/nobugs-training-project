package org.example.module.expressJava.сonditionalStatementsLoops.doWhileLoop;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int count = 0;

        do {
            number = number / 10;
            count++;
            } while (number != 0);
            System.out.println(count);
        }
    }
