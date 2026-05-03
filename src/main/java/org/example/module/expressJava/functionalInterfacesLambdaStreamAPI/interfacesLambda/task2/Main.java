package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.interfacesLambda.task2;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };

        runnable.run();
    }
}
