package org.example.module.expressJava.сonditionalStatementsLoops.taskSwitch;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите вашу оценку: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number <=89) {
            System.out.println("B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("C");
        } else if (number >= 60 && number <=69) {
            System.out.println("D");
        } else if (number < 60) {
            System.out.println("F");
        } else {
            System.out.println("Число выходит за рамки бальной системы");
        }
    }
}
