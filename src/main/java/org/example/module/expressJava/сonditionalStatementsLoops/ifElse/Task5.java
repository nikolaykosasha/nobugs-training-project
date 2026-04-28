package org.example.module.expressJava.сonditionalStatementsLoops.ifElse;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите ваш возраст: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 18) {
            System.out.println("Ваша скидка 25%");
        } else if (number >= 65) {
            System.out.println("Ваша скидка 30%");
        } else {
            System.out.println("Нет скидки");
        }
    }
}
