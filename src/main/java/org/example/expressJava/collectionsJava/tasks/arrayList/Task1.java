package org.example.expressJava.collectionsJava.tasks.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
        Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец.
         Выведите весь список.
         */

        List<Integer> integerList = Arrays.asList(3, 4, 6, 8, 6);
        integerList.forEach(System.out::println);
        System.out.println();

        integerList = new ArrayList<>(integerList);
        integerList.addLast(10);
        integerList.forEach(System.out::println);


    }
}
