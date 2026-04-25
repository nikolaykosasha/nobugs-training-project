package org.example.expressJava.collectionsJava.tasks.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        /*
        Проверьте, есть ли определённое имя в HashMap.
         */
        Map<String, Integer> map = new HashMap<>();

        map.put("Петя", 23);
        map.put("Вася", 33);
        map.put("Дмитрий", 45);
        map.put("Александр", 20);
        map.put("Михаил", 21);

        System.out.println("Есть ли имя Михаил: " + map.containsKey("Дмитрий"));
    }
}
