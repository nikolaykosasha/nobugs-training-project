package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 10, 11, 13, 55, 33);

        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println(result);
    }
}
