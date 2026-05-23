package org.example.module.expressJava.multithreading.task3;

public class Main {
    public static void main(String[] args) {

        /*
        Создайте поток, который бесконечно увеличивает счетчик.
        В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
         */

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> counter.startCount());
        t1.start();

        System.out.println("Счетчик = " + counter.getCount());
        System.out.println("Включен счетчик: " + counter.isCounterEnable());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter.stopCount();

        System.out.println("Счетчик = " + counter.getCount());
        System.out.println("Включен счетчик: " + counter.isCounterEnable());

    }
}
