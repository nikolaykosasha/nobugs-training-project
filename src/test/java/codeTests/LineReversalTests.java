package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineReversalTests {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    @ParameterizedTest
    @DisplayName("Успешный разворот строки")
    @ValueSource(strings = {"string", "Java", "12345"})
    void CheckingReversePositiveTest(String strings) {
        boolean actualResult = strings.equals(reverse(strings));

        assertFalse(actualResult);
    }

    @Test
    @DisplayName("Успешный разворот строки")
    void CheckingReverseNullTest() {
        String stringNull = null;
        String s = reverse(stringNull);

        boolean actualResult = s == null;

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @DisplayName("Разворот пустой строки")
    @ValueSource(strings = {""})
    void CheckingReverseEmptyTest(String strings) {

        String s = reverse(strings);
        boolean actualResult = s.isEmpty();

        assertTrue(actualResult);
    }
}

