package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task10;

import org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task8.OperationSum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 3, 5, 23, 15, 33, 10);
        boolean result = list.stream().anyMatch(i -> i % 2 == 0);

        System.out.println(result);
    }
}
