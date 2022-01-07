package org.home.maxdrv;

import org.home.maxdrv.ds.Coordinates;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.com/problems/flood-fill/
 * <p>
 * any pixels connected 4-directionally to the starting pixel
 * what does it mean?
 * <p>
 * I guess something like that
 * |   | x |   |
 * | x | o | x |
 * |   | x |   |
 * <p>
 * TODO: this solution working but its slow and memory expensive
 * how to fix?
 * 1. Queue -> recursion
 * 2. Coordinates - replace to something else
 * 3. pixels checked more than one time
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }

        int lenX = image[sr].length - 1;
        int lenY = image.length - 1;
        Queue<Coordinates> queue = new ArrayDeque<>();
        queue.add(new Coordinates(sc, sr));
        while (!queue.isEmpty()) {
            Coordinates coordinates = queue.poll();

            int x = coordinates.x();
            int y = coordinates.y();

            if (x - 1 >= 0 && image[y][x - 1] == oldColor) {
                queue.add(new Coordinates(x - 1, y));
            }
            if (x + 1 <= lenX && image[y][x + 1] == oldColor) {
                queue.add(new Coordinates(x + 1, y));
            }
            if (y - 1 >= 0 && image[y - 1][x] == oldColor) {
                queue.add(new Coordinates(x, y - 1));
            }
            if (y + 1 <= lenY && image[y + 1][x] == oldColor) {
                queue.add(new Coordinates(x, y + 1));
            }

            image[y][x] = newColor;
        }

        return image;
    }

}
