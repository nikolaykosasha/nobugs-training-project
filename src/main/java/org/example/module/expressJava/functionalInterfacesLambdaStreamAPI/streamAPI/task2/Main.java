package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 20, 5, 22, 15, 33);
        List<Integer> result = OperationInt.deleteInt(list);

        list.stream().forEach(System.out::println);

        System.out.println("------");

        result.stream().forEach(System.out::println);
    }
}
