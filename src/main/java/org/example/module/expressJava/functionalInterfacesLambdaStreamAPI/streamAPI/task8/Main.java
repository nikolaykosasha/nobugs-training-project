package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task8;

import org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task6_7.OperationMinMax;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 20, 5, 22, 15, 34);
        int resultMin = OperationSum.sumElements(list);

        System.out.println(resultMin);
    }
}
