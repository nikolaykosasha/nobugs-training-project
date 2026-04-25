package org.example.expressJava.collectionsJava.tasks.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте HashSet из 5 чисел и выведите его содержимое.
         */
        List<Integer> integerList = Arrays.asList(44, 66, 22, 11, 99);
        Set<Integer> integerSet = new HashSet<>(integerList);

        integerSet.forEach(System.out::println);
    }
}
