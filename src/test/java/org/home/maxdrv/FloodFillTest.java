package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void test01() {
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] actual = exec(image, 1, 1, 2);
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, actual);
    }

    @Test
    void test02() {
        int[][] image = new int[][]{{0, 0, 0}, {0, 0, 0}};
        int[][] actual = exec(image, 0, 0, 2);
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}}, actual);
    }

    @Test
    void test03() {
        int[][] image = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int[][] actual = exec(image, 1, 1, 1);
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}}, actual);
    }

    private static int[][] exec(int[][] image, int sr, int sc, int newColor) {
        return new FloodFill().floodFill(image, sr, sc, newColor);
    }

}