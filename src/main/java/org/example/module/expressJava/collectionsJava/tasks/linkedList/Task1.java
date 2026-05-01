package org.example.module.expressJava.collectionsJava.tasks.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
        Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка
         */

        List<String> stringList = new LinkedList<>();

        for (String s : stringList) {
            System.out.println(s);
        }

        stringList.add("Строка");
        stringList.add("Еще строка");
        stringList.add("Пример строки");
        stringList.add("Пример строки четыре");
        stringList.add("Пример строки пять");

        System.out.println();

        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
