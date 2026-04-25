package org.example.expressJava.collectionsJava.tasks.arrayList;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        /*
        Напишите программу, которая выводит все чётные числа из ArrayList.
         */
        List<Integer> integerList = Arrays.asList(10, 33, 45, 20);

        for (Integer number : integerList) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
