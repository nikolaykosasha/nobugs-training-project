package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 10, 11, 13, 55, 33, 45);

        double result = list.stream().collect(Collectors.averagingDouble(i -> i));
        System.out.println(result);
    }
}
