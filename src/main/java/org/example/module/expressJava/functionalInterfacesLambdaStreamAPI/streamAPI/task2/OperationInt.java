package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task2;

import java.util.List;

public class OperationInt {

    public static List<Integer> deleteInt(List<Integer> list) {
        return list.stream().filter(i -> i % 5 == 0).toList();
    }
}
