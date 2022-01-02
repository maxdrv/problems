package org.home.maxdrv;

/**
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">https://leetcode.com/problems/squares-of-a-sorted-array/</a>
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int h = nums.length - 1;

        int pos = nums.length - 1;
        int[] res = new int[nums.length];

        while (l <= h) {
            int h2 = nums[h] * nums[h];
            int l2 = nums[l] * nums[l];

            if (h2 > l2) {
                res[pos] = h2;
                h--;
            } else {
                res[pos] = l2;
                l++;
            }
            pos--;
        }

        return res;
    }

}
