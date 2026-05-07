package org.example.module.expressJava.multithreading.task3;

public class Counter {
    private long count = 0;
    private volatile boolean counterEnable = true;

    public long getCount() {
        return count;
    }

    public boolean isCounterEnable() {
        return counterEnable;
    }

    public void startCount() {

        while (counterEnable) {
            count++;
        }
    }

    public void stopCount() {
        this.counterEnable = false;
    }
}
