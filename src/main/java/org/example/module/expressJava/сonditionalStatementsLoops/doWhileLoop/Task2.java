package org.example.module.expressJava.сonditionalStatementsLoops.doWhileLoop;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String password = "102938qq";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String inPassword;
        do {
            inPassword = scanner.nextLine();
        } while (!inPassword.equals(password));
        System.out.println("Ввели: " + inPassword);
    }
}
