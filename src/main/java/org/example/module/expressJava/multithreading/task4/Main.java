package org.example.module.expressJava.multithreading.task4;

public class Main {
    public static void main(String[] args) {

        /*
        Напишите класс Counter с методом increment, увеличивающим значение счётчика.
        Создайте два потока, каждый из которых вызывает increment() 1000 раз.
        Обеспечьте правильную работу с помощью synchronized.
         */

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Счетчик = " + counter.getCount());
    }
}
