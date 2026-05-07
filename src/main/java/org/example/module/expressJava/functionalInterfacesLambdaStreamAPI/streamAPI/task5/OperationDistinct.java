package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task5;

import java.util.List;

public class OperationDistinct {

    public static List<String> distinctMethod(List<String> list) {
        return list.stream().distinct().toList();
    }
}
