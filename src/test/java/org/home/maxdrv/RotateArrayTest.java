package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    @Test
    void test01() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        exec(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void test02() {
        int[] nums = new int[]{-1, -100, 3, 99};
        exec(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void test03() {
        int[] nums = new int[]{-1, -100, 3, 99};
        exec(nums, 6);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void test04() {
        int[] nums = new int[]{1};
        exec(nums, 0);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void test05() {
        int[] nums = new int[]{1, 2};
        exec(nums, 1);
        assertArrayEquals(new int[]{2, 1}, nums);
    }

    private static void exec(int[] nums, int k) {
        new RotateArray().rotate(nums, k);
    }

}