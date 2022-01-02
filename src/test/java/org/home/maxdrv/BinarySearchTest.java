package org.home.maxdrv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void test01() {
        int actual = exec(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        Assertions.assertEquals(4, actual);
    }

    @Test
    void test02() {
        int actual = exec(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        Assertions.assertEquals(-1, actual);
    }

    private static int exec(int[] nums, int k) {
        return new BinarySearch().search(nums, k);
    }

}