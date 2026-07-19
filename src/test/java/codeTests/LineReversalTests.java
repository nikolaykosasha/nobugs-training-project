package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class LineReversalTests {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    @ParameterizedTest
    @DisplayName("Успешный разворот строки")
    @CsvSource({
            "string, gnirts",
            "Java, avaJ",
            "12345, 54321"
    })
    void checkingReversePositiveTest(String input, String expected) {

        String actualResult = reverse(input);

        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Разворот null строки")
    void checkingReverseNullTest() {

        assertNull(reverse(null));
    }

    @Test
    @DisplayName("Разворот пустой строки")
    void checkingReverseEmptyTest() {

        assertEquals("", reverse(""));
    }

    @Test
    @DisplayName("Разворот палиндрома")
    void checkingReversePalindromeTest() {

        assertEquals("level", reverse("level"));
    }
}