package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfASortedArrayTest {

    @Test
    void test01() {
        int[] actual = exec(new int[]{-4, -1, 0, 3, 10});
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, actual);
    }

    @Test
    void test02() {
        int[] actual = exec(new int[]{-7, -3, 2, 3, 11});
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, actual);
    }

    private static int[] exec(int[] nums) {
        return new SquaresOfASortedArray().sortedSquares(nums);
    }

}
