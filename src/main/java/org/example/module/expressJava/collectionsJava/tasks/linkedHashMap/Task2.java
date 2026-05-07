package org.example.module.expressJava.collectionsJava.tasks.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        /*
        Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
         */

        Map<String, Integer> phoneBook = new LinkedHashMap<>();

        phoneBook.put("Иванов Иван Иванович", 899999999);
        phoneBook.put("Иванов Иван Михайлович", 899990099);
        phoneBook.put("Петров Иван Михайлович", 899110099);

        System.out.println(phoneBook.get("Петров Иван Михайлович"));
    }
}
