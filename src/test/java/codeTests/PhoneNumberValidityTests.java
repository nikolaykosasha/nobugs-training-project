package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberValidityTests {

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

    @Test
    @DisplayName("Проверка валидности номера телефона - Корректные номера")
    void PhoneNumberValidityPositiveTests() {
        String phone = "+1 1234567890";

        boolean actualResult = isValidPhoneNumber(phone);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @DisplayName("Проверка валидности номера телефона - Некорректные номера")
    @ValueSource(strings = {"12345", "invalid"})
    void PhoneNumberValidityNegativeTests(String string) {
        boolean actualResult = isValidPhoneNumber(string);

        assertFalse(actualResult);
    }
}
