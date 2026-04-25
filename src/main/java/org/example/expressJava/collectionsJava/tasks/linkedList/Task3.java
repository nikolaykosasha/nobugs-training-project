package org.example.expressJava.collectionsJava.tasks.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        /*
        Создайте LinkedList, содержащий несколько строк.
        Напишите программу, которая печатает первый и последний элементы списка.
         */

        List<String> stringList = Arrays.asList("Строка 1", "Строка 2", "Строка 3", "Строка конец");

        System.out.println(stringList.getFirst());
        System.out.println(stringList.getLast());
    }
}
