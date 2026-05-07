package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Строка", "Три", "Длинная строка остается", "Ян");

        list.stream().forEach(System.out::println);

        List<String> result = OperationsList.deleteList(list);

        System.out.println("++++++");

        result.stream().forEach(System.out::println);
    }
}
