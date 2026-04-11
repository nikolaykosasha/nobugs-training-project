package org.example.module.expressJava.сonditionalStatementsLoops.taskSwitch;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите вашу команду: ");
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Статус системы");
            default -> System.out.println("Неизвестная команда");
        }
    }
}
