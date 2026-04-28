package org.example.module.expressJava.сonditionalStatementsLoops.whileLoop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        int number = scanner.nextInt();

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
