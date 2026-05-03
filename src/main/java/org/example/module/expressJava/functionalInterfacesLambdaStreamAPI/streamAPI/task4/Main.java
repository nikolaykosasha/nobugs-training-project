package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4);
        List<Integer> result = OperationMultiplication.costMultiplication(list);

        list.stream().forEach(System.out::println);
        System.out.println("+++++");
        result.stream().forEach(System.out::println);
    }
}
