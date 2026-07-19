package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTests {

    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    @ParameterizedTest
    @DisplayName("Максимальное значение в массиве обычный массив")
    @ValueSource(ints = {7})
    void findMaxArrayTests(int ints) {
        int[] array = {3, 5, 7, 2};
        int actualResult = findMax(array);

        assertEquals(ints, actualResult);
    }

    @ParameterizedTest
    @DisplayName("Максимальное значение в массиве обычный массив")
    @ValueSource(ints = {5})
    void findMaxOneTests(int ints) {
        int[] array = {5};
        int actualResult = findMax(array);

        assertEquals(ints, actualResult);
    }

    @ParameterizedTest
    @DisplayName("Максимальное значение в массиве обычный массив")
    @ValueSource(ints = {-2})
    void findMaxNegativeTests(int ints) {
        int[] array = {-3, -5, -7, -2};
        int actualResult = findMax(array);

        assertEquals(ints, actualResult);
    }

    @Test
    @DisplayName("Подсчёт количества гласных в строке - проверка исключения")
    void findMaxExceptionTests() {

        assertThrows(NullPointerException.class, () -> {
            findMax(null);
        }, "Checking if Null arr should lead to IllegalArgumentException");
    }

    @Test
    @DisplayName("Пустой массив должен выбрасывать исключение")
    void findMaxEmptyArrayTests() {

        int[] array = {};

        assertThrows(NoSuchElementException.class, () -> {
            findMax(array);
        });
    }
}
