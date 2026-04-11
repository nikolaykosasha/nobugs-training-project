package org.example.module.expressJava.сonditionalStatementsLoops.breakContinue;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string;

        while (true) {
            string = scanner.nextLine();
            if (string.equals("stop")) {
                break;
            }
            System.out.println(string);
        }
    }
}
