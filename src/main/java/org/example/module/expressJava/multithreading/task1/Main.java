package org.example.module.expressJava.multithreading.task1;

public class Main {
    public static void main(String[] args) {

        /*
        Напишите программу, в которой создается отдельный поток,
        выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
         */
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();

    }
}
