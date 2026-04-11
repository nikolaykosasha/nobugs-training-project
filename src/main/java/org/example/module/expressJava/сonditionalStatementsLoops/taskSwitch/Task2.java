package org.example.module.expressJava.сonditionalStatementsLoops.taskSwitch;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1,2,3,4,5 -> System.out.println("Будние дни — 300 рублей");
            case 6,7 -> System.out.println("Выходные — 450 рублей");
            default -> System.out.println("Не относится к дням недели");
        }
    }
}
