package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTests {

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @ParameterizedTest
    @DisplayName("Проверка высокосного года - обычные года")
    @ValueSource(ints = {1999, 2002, 2005})
    void shouldFalseIsLeapYear(int ints) {
        assertFalse(isLeapYear(ints));
    }

    @ParameterizedTest
    @DisplayName("Проверка высокосного года - Високосные (2020, 2000, 1600)")
    @ValueSource(ints = {2020, 2000, 1600})
    void shouldTrueIsLeapYear(int ints) {
        assertTrue(isLeapYear(ints));
    }

    @ParameterizedTest
    @DisplayName("Проверка высокосного года - Года, которые делятся на 100, но не на 400")
    @ValueSource(ints = {1900, 2100})
    void shouldIsLeapYear400(int ints) {
        assertFalse(isLeapYear(ints));
    }
}
