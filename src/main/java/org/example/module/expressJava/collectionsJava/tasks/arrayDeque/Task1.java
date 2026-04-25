package org.example.module.expressJava.collectionsJava.tasks.arrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {

        /*
        Создайте ArrayDeque, добавьте 5 элементов и выведите их.
         */

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(45);
        queue.add(20);
        queue.add(10);
        queue.add(1);
        queue.add(5);

        queue.forEach(System.out::println);
    }
}
