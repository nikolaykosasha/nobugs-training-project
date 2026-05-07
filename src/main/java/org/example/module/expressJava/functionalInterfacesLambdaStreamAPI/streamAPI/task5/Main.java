package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task5;

import org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task3.OperationMap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = List.of("Ян", "Ян", "Саша", "Саша", "Петя");
        List<String> result = OperationDistinct.distinctMethod(stringList);

        stringList.stream().forEach(System.out::println);
        System.out.println("++++++");
        result.stream().forEach(System.out::println);
    }
}
