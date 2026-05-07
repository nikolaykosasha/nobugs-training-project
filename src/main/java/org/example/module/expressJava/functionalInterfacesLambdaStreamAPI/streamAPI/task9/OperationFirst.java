package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task9;

import java.util.List;

public class OperationFirst {

    public static String searchFirst(List<String> list) {
        return list.stream().filter(s -> s.startsWith("Б")).findFirst().get();
    }
}
