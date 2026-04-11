package org.example.module.expressJava.сonditionalStatementsLoops.ifElse;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите вашу оценку: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number >= 90) {
            System.out.println("Отлично");
        } else if (number >= 75 && number <=89) {
            System.out.println("Хорошо");
        } else if (number >= 60 && number <= 74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Число выходит за рамки бальной системы");
        }
    }
}
