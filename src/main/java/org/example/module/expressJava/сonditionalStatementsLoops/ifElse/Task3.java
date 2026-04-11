package org.example.module.expressJava.сonditionalStatementsLoops.ifElse;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 1,2 -> System.out.println("Неудовлетворительно");
            default -> System.out.println("Число выходит за рамки бальной системы");
        }
    }
}
