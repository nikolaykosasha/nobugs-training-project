package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Апельсин", "Азия", "Банан", "Ботинок");

        Map<String, List<String>> result = list.stream().collect(Collectors.groupingBy(s -> s.substring(0, 1)));
        System.out.println(result);
    }
}
