package org.home.maxdrv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void test01() {
        int actual = exec(new int[]{1,3,5,6}, 5);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void test02() {
        int actual = exec(new int[]{1,3,5,6}, 2);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void test03() {
        int actual = exec(new int[]{1,3,5,6}, 7);
        Assertions.assertEquals(4, actual);
    }

    private static int exec(int[] nums, int k) {
        return new SearchInsertPosition().search(nums, k);
    }

}