package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaOfIslandTest {

    @Test
    void test01() {
        int[][] grid = new int[][]{
                {1, 0, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 1, 1},
        };

        int actual = exec(grid);
        assertEquals(5, actual);
    }

    @Test
    void test02() {
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int actual = exec(grid);
        assertEquals(0, actual);
    }

    @Test
    void test03() {
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        int actual = exec(grid);
        assertEquals(6, actual);
    }

    @Test
    void test04() {
        int[][] grid = new int[][]{
                {0, 1},
                {1, 0}
        };

        int actual = exec(grid);
        assertEquals(1, actual);
    }

    private static int exec(int[][] grid) {
        return new MaxAreaOfIsland().maxAreaOfIsland(grid);
    }

}