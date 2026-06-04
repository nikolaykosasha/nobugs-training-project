package org.example.module.expressJava.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (String name : names) {
            if (name.startsWith("A")) {
                List<String> result = new ArrayList<>(names);
                result.remove(name);
            }
        }
    }
}
