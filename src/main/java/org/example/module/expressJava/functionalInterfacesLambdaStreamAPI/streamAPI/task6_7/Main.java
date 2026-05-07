package org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task6_7;

import org.example.module.expressJava.functionalInterfacesLambdaStreamAPI.streamAPI.task2.OperationInt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(23, 20, 5, 22, 15, 33);
        int resultMin = OperationMinMax.searchMin(list);
        int resultMax = OperationMinMax.searchMax(list);

        System.out.println(resultMin);
        System.out.println(resultMax);
    }
}
