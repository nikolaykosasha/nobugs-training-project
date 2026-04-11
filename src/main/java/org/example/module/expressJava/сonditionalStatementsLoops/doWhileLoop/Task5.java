package org.example.module.expressJava.сonditionalStatementsLoops.doWhileLoop;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int count = 0;


        if (number != 0) {
            do {
                count++;
                number = number / 10;
            } while (number != 0);
            System.out.println(count);
        } else {
            System.out.println("0 не подходит");
        }
    }
}
