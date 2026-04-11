package org.example.module.expressJava.сonditionalStatementsLoops.taskSwitch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Не относится к дням недели");
        }
    }
}
