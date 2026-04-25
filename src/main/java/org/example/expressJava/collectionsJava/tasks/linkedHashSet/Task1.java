package org.example.expressJava.collectionsJava.tasks.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        /*
        Создайте LinkedHashSet и добавьте в него 5 строк.
        Проверьте порядок элементов при выводе.
         */

        Set<String> set = new LinkedHashSet<>();

        set.add("Строка 1");
        set.add("Строка 2");
        set.add("Строка 3");
        set.add("Строка 4");
        set.add("Строка 5");

        set.forEach(System.out::println);
    }
}
