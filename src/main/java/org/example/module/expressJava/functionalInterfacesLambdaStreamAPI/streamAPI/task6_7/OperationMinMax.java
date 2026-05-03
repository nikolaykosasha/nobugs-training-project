package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task6_7;

import java.util.Comparator;
import java.util.List;

public class OperationMinMax {

    public static int searchMin(List<Integer> list) {
        return list.stream().min(Integer::compareTo).get();
    }

    public static int searchMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo).get();
    }
}
