package org.example.expressJava.collectionsJava.tasks.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте LinkedHashMap и добавьте в него 5 элементов.
        Выведите их в порядке добавления.
         */

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(234, "Петя");
        map.put(100, "Дима");
        map.put(99, "Миша");
        map.put(10, "Аврелий");
        map.put(24, "Саша");

        map.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
