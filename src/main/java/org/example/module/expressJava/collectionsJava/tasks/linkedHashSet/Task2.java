package org.example.module.expressJava.collectionsJava.tasks.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    /*
    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
     */
    Set<String> stringSet = new LinkedHashSet<>();

    private void addSet(String string) {
        stringSet.add(string);
    }
}
