package org.example.module.expressJava.сonditionalStatementsLoops.whileLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        int number = scanner.nextInt();

        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }
}
