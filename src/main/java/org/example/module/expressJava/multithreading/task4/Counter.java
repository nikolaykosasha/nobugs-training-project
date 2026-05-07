package org.example.module.expressJava.multithreading.task4;

public class Counter {
    private long count = 0;

    public synchronized void increment() {
        count++;
    }

    public long getCount() {
        return count;
    }
}
