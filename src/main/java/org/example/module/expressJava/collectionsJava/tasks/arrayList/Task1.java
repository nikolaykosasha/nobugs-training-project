package org.example.module.expressJava.collectionsJava.tasks.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
        Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец.
         Выведите весь список.
         */

        List<Integer> integerList = new ArrayList<>(List.of(3, 4, 6, 8, 6));
        integerList.forEach(System.out::println);
        System.out.println();

        integerList = new ArrayList<>(integerList);
        integerList.add(10);
        integerList.forEach(System.out::println);


    }
}
