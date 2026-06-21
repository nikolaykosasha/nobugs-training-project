package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
    @CsvSource({
            "hello, 2",
            "java, 2",
            "AEIOU, 5",
            "'', 0",
            "hll, 0",
            "jv, 0"
    })
    void checkingNumberOfVowels(String input, int expected) {

        int actualResult = countVowels(input);

        assertEquals(expected, actualResult);
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
    @CsvSource({
            "'', 0",
            "hll, 0",
            "jv, 0"
    })
    void CheckingNumberOfVowelsNegative(String input, int expected) {

        int actualResult = countVowels(input);

        assertEquals(expected, actualResult);
    }
}
