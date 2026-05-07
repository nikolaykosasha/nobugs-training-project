package org.example.module.expressJava.exceptionsGenerics.generics.task2;
/*
Условие задачи: Напишите дженерик метод printArray,
который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
 */

public class PrintBox {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
