package org.home.maxdrv.sort;

import org.home.maxdrv.util.TestFunctions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {

    @TestFunctions
    void test01(Sort sort) {
        int[] numbers = new int[]{1, 15, -9, 8, 5, 0};
        sort.sort(numbers);
        assertArrayEquals(new int[]{-9, 0, 1, 5, 8, 15}, numbers);
    }

    @TestFunctions
    void test02(Sort sort) {
        int[] numbers = new int[]{1};
        sort.sort(numbers);
        assertArrayEquals(new int[]{1}, numbers);
    }

    @TestFunctions
    void test03(Sort sort) {
        int[] numbers = new int[0];
        sort.sort(numbers);
        assertArrayEquals(new int[0], numbers);
    }

    @TestFunctions
    void test04(Sort sort) {
        int[] numbers = new int[]{1, 1, 1, 1, 1};
        sort.sort(numbers);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, numbers);
    }

    @TestFunctions
    void test05(Sort sort) {
        int[] numbers = new int[]{1, 1, 1, 1, 1, 0};
        sort.sort(numbers);
        assertArrayEquals(new int[]{0, 1, 1, 1, 1, 1}, numbers);
    }

    private static List<Sort> functions() {
        return List.of(
                new SelectionSort()
        );
    }

}