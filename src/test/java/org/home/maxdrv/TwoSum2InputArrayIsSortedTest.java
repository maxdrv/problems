package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum2InputArrayIsSortedTest {

    @Test
    void test01() {
        int[] actual = exec(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    void test02() {
        int[] actual = exec(new int[]{2, 3, 4}, 6);
        assertArrayEquals(new int[]{1, 3}, actual);
    }

    @Test
    void test03() {
        int[] actual = exec(new int[]{-1, 0}, -1);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    private static int[] exec(int[] numbers, int target) {
        return new TwoSum2InputArrayIsSorted().twoSum(numbers, target);
    }

}