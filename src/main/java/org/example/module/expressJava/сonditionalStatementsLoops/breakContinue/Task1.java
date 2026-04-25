package org.example.module.expressJava.сonditionalStatementsLoops.breakContinue;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        while (true) {
            if (number < 0) {
                break;
            }
            sum += number;

            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
