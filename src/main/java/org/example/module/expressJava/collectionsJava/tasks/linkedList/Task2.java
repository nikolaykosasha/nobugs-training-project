package org.example.module.expressJava.collectionsJava.tasks.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        /*
        Реализуйте очередь задач с LinkedList.
        Добавьте 3 задачи и обработайте их в порядке поступления.
         */

        List<String> taskList = new LinkedList<>();

        taskList.addLast("Задача 1");
        taskList.addLast("Задача 2");
        taskList.addLast("Задача 3");

        taskList.getFirst();


    }
}
