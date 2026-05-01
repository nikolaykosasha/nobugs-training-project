package org.example.module.expressJava.exceptionsGenerics.exceptions.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader reader;

        {
            try {
                reader = new FileReader("data.txt");
            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден: " + e.getMessage());
            }
        }
    }
}
