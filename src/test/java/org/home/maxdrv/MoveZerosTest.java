package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {
    
    @Test
    void test01() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        exec(arr);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr);
    }

    @Test
    void test02() {
        int[] arr = new int[]{0};
        exec(arr);
        assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void test03() {
        int[] arr = new int[]{0, 0, 1, 0, 3, 12};
        exec(arr);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0, 0}, arr);
    }

    private static void exec(int[] arr) {
        new MoveZeroes().moveZeroes(arr);
    }

}