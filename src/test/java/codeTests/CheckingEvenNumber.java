package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingEvenNumber {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    @ParameterizedTest
    @DisplayName("Проверка чётности числа - четные числа")
    @ValueSource(ints = {4, -2, 0})
    void checkingEvenNumberPositive(int ints) {

        boolean actualResult = isEven(ints);

        assertTrue(actualResult);

    }

    @ParameterizedTest
    @DisplayName("Проверка чётности числа - не четные числа")
    @ValueSource(ints = {5, -7})
    void checkingEvenNumberNegative(int ints) {

        boolean actualResult = isEven(ints);

        assertFalse(actualResult);

    }
}
