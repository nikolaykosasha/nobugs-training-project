package org.example.module.expressJava.collectionsJava.tasks.arrayList;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        /*
        Создайте ArrayList из целых чисел.
        Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
         */

        List<Integer> integerList = Arrays.asList(44, 67, 10, 22, 55, 1);
        int sum = 0;
        for (int number : integerList) {
            sum += number;
        }

        System.out.println(sum);

    }
}
