package org.example.module.expressJava.collectionsJava.tasks.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {

        /*
        Реализуйте очередь задач с LinkedList.
        Добавьте 3 задачи и обработайте их в порядке поступления.
         */

        Queue<String> taskList = new LinkedList<>();

        taskList.add("Задача 21");
        taskList.add("Задача 1");
        taskList.add("Задача 2");

        while (!taskList.isEmpty()) {

            taskList.poll();
        }
    }
}
