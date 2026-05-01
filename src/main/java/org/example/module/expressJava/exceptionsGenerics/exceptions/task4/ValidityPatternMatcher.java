package org.example.module.expressJava.exceptionsGenerics.exceptions.task4;

import java.util.regex.Pattern;

public class ValidityPatternMatcher {

    public static boolean checkPatternMatcher(String pattern) {
        boolean result = true;
        {
            try {
                result = Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", pattern);

                if (!result) {
                    throw new PatternMatcherExceptions("Не совпал паттерн");
                }
            } catch (PatternMatcherExceptions e) {
                System.err.println(e.getMessage());
            }
        }
        return result;
    }
}
