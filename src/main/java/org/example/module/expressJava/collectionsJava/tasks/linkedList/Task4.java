package org.example.module.expressJava.collectionsJava.tasks.linkedList;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        /*
        Создайте LinkedList из целых чисел.
        Напишите программу, которая вычисляет сумму элементов списка.
         */

        List<Integer> list = Arrays.asList(34, 46, 67, 44, 1);
        int sum = 0;

        for (int n : list) {
            sum += n;
        }

        System.out.println(sum);
    }
}
