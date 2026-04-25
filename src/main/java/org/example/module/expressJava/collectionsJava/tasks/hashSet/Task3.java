package org.example.module.expressJava.collectionsJava.tasks.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
        /*
        Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов
         */

    List<String> list = Arrays.asList("Ы", "er");

    private Set<String> addSett(List<String> list) {
        return new HashSet<>(list);

    }
}
