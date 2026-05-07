package org.example.module.expressJava.collectionsJava.tasks.treeSet;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        /*
        Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
         */

        List<Integer> integerList = Arrays.asList(44, 66, 22, 11, 99);
        Set<Integer> integerSet = new TreeSet<>(integerList);

        integerSet.forEach(System.out::println);
    }
}
