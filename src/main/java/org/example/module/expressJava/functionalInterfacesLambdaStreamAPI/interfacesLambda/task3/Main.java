package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.interfacesLambda.task3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (i) ->  i % 2 == 0;
        boolean result = predicate.test(2);
        System.out.println(result);

    }
}
