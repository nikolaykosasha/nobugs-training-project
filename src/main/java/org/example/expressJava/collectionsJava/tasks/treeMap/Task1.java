package org.example.expressJava.collectionsJava.tasks.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы).
        Выведите отсортированные данные.
         */

        Map<String, Integer> map = new TreeMap<>();

        map.put("Петр", 77);
        map.put("Владимир", 90);
        map.put("Михаил", 55);
        map.put("Андрей", 80);
        map.put("Александр", 77);

        map.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
