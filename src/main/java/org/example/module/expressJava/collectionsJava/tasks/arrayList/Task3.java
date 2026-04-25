package org.example.module.expressJava.collectionsJava.tasks.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

        /*
        Создайте ArrayList из строк.
        Найдите в нём самую длинную строку и выведите её.
         */

        List<String> stringList = new ArrayList<>();
        String maxLengtString = "";


        stringList.add("Три");
        stringList.add("Длина 7");
        stringList.add("Длина строки 15");

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > maxLengtString.length()) {
                maxLengtString = stringList.get(i);
            }
        }
        System.out.println(maxLengtString);
    }
}
