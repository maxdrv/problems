package org.home.maxdrv;

import org.home.maxdrv.ds.Coordinates;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.com/problems/max-area-of-island/submissions/
 *
 * TODO: this solution working but its slow and memory expensive and its looking horrible.
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int lenX = grid[0].length - 1;
        int lenY = grid.length - 1;

        Queue<Coordinates> zeros = new ArrayDeque<>();
        Queue<Coordinates> ones = new ArrayDeque<>();

        Coordinates start = new Coordinates(0, 0);
        if (grid[0][0] == 1) {
            ones.add(start);
        } else {
            zeros.add(start);
        }

        int max = 0;
        int size = 0;
        while (!zeros.isEmpty() || !ones.isEmpty()) {

            if (!ones.isEmpty()) {
                Coordinates one = ones.poll();
                int x1 = one.x();
                int y1 = one.y();

                if (visited[y1][x1]) {
                    continue;
                }

                if (x1 - 1 >= 0 && !visited[y1][x1 - 1]) {
                    Coordinates nPoint = new Coordinates(x1 - 1, y1);
                    if (grid[y1][x1 - 1] == 1) {
                        ones.add(nPoint);
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (x1 + 1 <= lenX && !visited[y1][x1 + 1]) {
                    Coordinates nPoint = new Coordinates(x1 + 1, y1);
                    if (grid[y1][x1 + 1] == 1) {
                        ones.add(nPoint);
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (y1 - 1 >= 0 && !visited[y1 - 1][x1]) {
                    Coordinates nPoint = new Coordinates(x1, y1 - 1);
                    if (grid[y1 - 1][x1] == 1) {
                        ones.add(nPoint);
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (y1 + 1 <= lenY && !visited[y1 + 1][x1]) {
                    Coordinates nPoint = new Coordinates(x1, y1 + 1);
                    if (grid[y1 + 1][x1] == 1) {
                        ones.add(nPoint);
                    } else {
                        zeros.add(nPoint);
                    }
                }

                size++;
                if (max < size) {
                    max = size;
                }
                visited[y1][x1] = true;
            } else {
                size = 0;
                Coordinates zero = zeros.poll();
                int x0 = zero.x();
                int y0 = zero.y();

                if (visited[y0][x0]) {
                    continue;
                }

                if (x0 - 1 >= 0 && !visited[y0][x0 - 1]) {
                    Coordinates nPoint = new Coordinates(x0 - 1, y0);
                    if (grid[y0][x0 - 1] == 1) {
                        ones.add(nPoint);
                        continue;
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (x0 + 1 <= lenX && !visited[y0][x0 + 1]) {
                    Coordinates nPoint = new Coordinates(x0 + 1, y0);
                    if (grid[y0][x0 + 1] == 1) {
                        ones.add(nPoint);
                        continue;
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (y0 - 1 >= 0 && !visited[y0 - 1][x0]) {
                    Coordinates nPoint = new Coordinates(x0, y0 - 1);
                    if (grid[y0 - 1][x0] == 1) {
                        ones.add(nPoint);
                        continue;
                    } else {
                        zeros.add(nPoint);
                    }
                }
                if (y0 + 1 <= lenY && !visited[y0 + 1][x0]) {
                    Coordinates nPoint = new Coordinates(x0, y0 + 1);
                    if (grid[y0 + 1][x0] == 1) {
                        ones.add(nPoint);
                        continue;
                    } else {
                        zeros.add(nPoint);
                    }
                }
                
                visited[y0][x0] = true;
            }
        }
        return max;
    }
}
