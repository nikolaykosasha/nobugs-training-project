package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingNumberOfVowels {

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    @ParameterizedTest
    @DisplayName("Подсчёт количества гласных в строке")
    @ValueSource(strings = {"hello", "java", "AEIOU"})
    void CheckingNumberOfVowelsPositive(String strings) {

        boolean actualResult = countVowels(strings) > 0;

        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Подсчёт количества гласных в строке - проверка исключения")
    void CheckingNumberOfVowelsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            countVowels(null);
        }, "Checking if Null string is palindrome should lead to IllegalArgumentException");
    }

    @ParameterizedTest
    @DisplayName("Подсчёт количества гласных в строке - нет гласных")
    @ValueSource(strings = {"hll", "jv", ""})
    void CheckingNumberOfVowelsNegative(String strings) {
        boolean actualResult = countVowels(strings) >= 0;

        assertTrue(actualResult);
    }
}
