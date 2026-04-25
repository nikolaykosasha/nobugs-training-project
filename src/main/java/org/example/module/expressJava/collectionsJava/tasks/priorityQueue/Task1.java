package org.example.module.expressJava.collectionsJava.tasks.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
         */

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(4);
        queue.add(10);
        queue.add(1);
        queue.add(2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
