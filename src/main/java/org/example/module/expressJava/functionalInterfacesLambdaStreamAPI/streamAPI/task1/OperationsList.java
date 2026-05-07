package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task1;

import java.util.List;

public class OperationsList {

    public static List<String> deleteList(List<String> list) {
        return list.stream().filter(s -> s.length() > 5).toList();
    }
}
