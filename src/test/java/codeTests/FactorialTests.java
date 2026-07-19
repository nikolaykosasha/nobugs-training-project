package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTests {

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    @Test
    @DisplayName("Факториал числа: 0")
    void factorialnumber0() {
        int actualResult = factorial(0);

        assert actualResult == 1;
    }

    @Test
    @DisplayName("Факториал числа: 1")
    void factorialnumber1() {
        int actualResult = factorial(1);

        assert actualResult == 1;
    }

    @Test
    @DisplayName("Факториал числа: 5")
    void factorialnumber5() {
        int actualResult = factorial(5);

        assert actualResult == 120;
    }

    @Test
    @DisplayName("Факториал числа: 7")
    void factorialnumber7() {
        int actualResult = factorial(7);

        assert actualResult == 5040;
    }

    @Test
    @DisplayName("Факториал числа: -5")
    void factorialNegative() {

        assertThrows(IllegalArgumentException.class, () -> {
            factorial(-5);
        }, "Нельзя найти факториал отрицательного числа");
    }
}