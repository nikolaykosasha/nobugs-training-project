package org.example.module.expressJava.collectionsJava.tasks.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        /*
        Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
         */

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i <= 10; i++) {
            integerSet.add(i);
        }

        System.out.println("Содержит число: " + integerSet.contains(20));
    }
}
