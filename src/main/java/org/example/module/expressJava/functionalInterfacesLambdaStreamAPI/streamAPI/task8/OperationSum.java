package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task8;

import java.util.List;
import java.util.stream.Collectors;

public class OperationSum {

    public static int sumElements(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
