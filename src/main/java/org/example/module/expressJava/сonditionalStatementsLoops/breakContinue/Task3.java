package org.example.module.expressJava.сonditionalStatementsLoops.breakContinue;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number;

//        do {
//            number = scanner.nextInt();
//            if (number > 0) {
//                System.out.println(number);
//                continue;
//            }
//        } while (!(number < 0));


        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }

            if (number == 0) {
                break;
            }

            System.out.println(number);

        }
    }
}
