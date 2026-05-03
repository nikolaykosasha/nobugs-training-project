package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task3;

import java.util.List;

public class OperationMap {

    public static List<Integer> lengthList(List<String> list) {
        return list.stream().map(l -> l.length()).toList();
    }
}
