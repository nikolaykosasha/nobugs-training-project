package org.example.module.expressJava.collectionsJava.tasks.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        /*
        Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
         */

        Map<String, Integer> map = new HashMap<>();

        map.put("Петя", 23);
        map.put("Вася", 33);
        map.put("Дмитрий", 45);
        map.put("Александр", 20);
        map.put("Михаил", 21);

        map.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
