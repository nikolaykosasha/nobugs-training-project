package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task9;

import org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task5.OperationDistinct;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = List.of("Ян", "Михаил", "Ваня", "Саша", "Брат", "Борис", "Броня");
        String result = OperationFirst.searchFirst(stringList);

        System.out.println(result);
    }
}
