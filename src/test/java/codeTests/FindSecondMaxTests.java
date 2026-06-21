package codeTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTests {

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    @Test
    @DisplayName("Второе по величине число - Обычный массив")
    void arrayTest() {
        int[] array = {2, 5, 6, 4, 1};

        int actualResult = findSecondMax(array);

        assert actualResult == 5;
    }

    @Test
    @DisplayName("Второе по величине число - Массив с повторяющимся максимумом")
    void arrayWithDuplicateMax() {
        int[] array = {2, 5, 6, 4, 6};

        int actualResult = findSecondMax(array);

        assertEquals(5, actualResult);
    }

    @Test
    @DisplayName("Второе по величине число - Массив с одним элементом")
    void OneElementArray() {
        int[] array = {2};

        assertThrows(IllegalArgumentException.class, () -> {
            findSecondMax(array);
        }, "Checking if OneElementArray arr should lead to IllegalArgumentException");
    }
}
