package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.interfacesLambda.task4;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        String string = "Скажи длину этой строки";
        Function<String, Integer> lengthString = (s) -> s.length();

        System.out.println(lengthString.apply(string));
    }
}

