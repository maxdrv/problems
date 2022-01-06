package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test01() {
        int actual = exec(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(4, actual);
    }

    @Test
    void test02() {
        int actual = exec(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        assertEquals(-1, actual);
    }

    private static int exec(int[] nums, int k) {
        return new BinarySearch().search(nums, k);
    }

}