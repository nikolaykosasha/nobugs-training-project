package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberWordsLineTests {

    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    @ParameterizedTest
    @DisplayName("Подсчёт количества слов в строке - позитивный")
    @ValueSource(strings = {"Строка   здесь   будет пять слов", "Пять пять пять пять пять"})
    void NumberWordsLinePositiveTests(String strings) {
        int actualResult = countWords(strings);

        assert actualResult == 5;
    }

    @ParameterizedTest
    @DisplayName("Подсчёт количества слов в строке - пустая строка")
    @ValueSource(strings = {""})
    void NumberWordsLineNegativeTests(String strings) {

        int actualResult = countWords(strings);

        assert actualResult == 0;
    }

    @Test
    @DisplayName("Подсчёт количества слов в строке - null")
    void NumberWordsLineNullTests() {
        String string = null;

        assertThrows(NullPointerException.class, () -> {
            countWords(string);
        }, "Checking if Null string is NullPointerException");
    }
}
