package org.example.module.expressJava.сonditionalStatementsLoops.whileLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int result = 1;

        int number = scanner.nextInt();


        while (i <= number) {
            result = result * i;
            i++;
        }

        System.out.println(result);
    }
}
