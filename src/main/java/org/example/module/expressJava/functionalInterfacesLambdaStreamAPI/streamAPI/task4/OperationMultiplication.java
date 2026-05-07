package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task4;

import java.util.List;

public class OperationMultiplication {

    public static List<Integer> costMultiplication(List<Integer> list) {
        return list.stream().map(i -> i * i).toList();
    }
}
