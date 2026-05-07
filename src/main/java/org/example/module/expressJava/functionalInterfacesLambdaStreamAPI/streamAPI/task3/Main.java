package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = List.of("Длина такая", "Ян", "Тридцать три богатыря", "Саша");
        List<Integer> result = OperationMap.lengthList(stringList);

        stringList.stream().forEach(System.out::println);
        System.out.println("++++++");
        result.stream().forEach(System.out::println);
    }
}
