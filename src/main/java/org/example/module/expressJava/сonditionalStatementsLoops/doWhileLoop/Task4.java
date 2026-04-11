package org.example.module.expressJava.сonditionalStatementsLoops.doWhileLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите exit: ");

        String stringIn = scanner.nextLine();

        do {
            stringIn = scanner.nextLine();
        } while (!stringIn.equals("exit"));
    }
}
