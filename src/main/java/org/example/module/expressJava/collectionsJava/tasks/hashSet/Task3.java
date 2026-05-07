package org.example.module.expressJava.collectionsJava.tasks.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
        /*
        Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов
         */

    public static Set<String> addSett(List<String> list) {
        return new HashSet<>(list);

    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ы", "er");

        Set result = Task3.addSett(list);
    }
}
