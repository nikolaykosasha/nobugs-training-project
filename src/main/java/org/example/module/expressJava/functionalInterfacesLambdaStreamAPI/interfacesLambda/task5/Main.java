package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.interfacesLambda.task5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        
        Consumer<String> startPrint = (s) -> System.out.println(s);

        startPrint.accept("Выведи в консоль");
    }
}
