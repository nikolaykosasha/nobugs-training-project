package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTests {

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    /*
    Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null
     */

    @ParameterizedTest
    @DisplayName("Проверка метода isValidEmail - позитивный")
    @ValueSource(strings = {"test@example.com"})
    void isValidEmailPositiveTest(String string) {
        assertTrue(isValidEmail(string));
    }

    @ParameterizedTest
    @DisplayName("Проверка метода isValidEmail - негативный")
    @ValueSource(strings = {"bad@.com", "no-at-symbol", ""})
    void isValidEmailNegativeTest(String string) {
        assertFalse(isValidEmail(string));
    }

    @Test
    @DisplayName("Проверка метода isValidEmail - null")
    void isValidEmailNullTest() {

        String email = null;
        assertFalse(isValidEmail(email));
    }
}
