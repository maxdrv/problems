package org.home.maxdrv;

/**
 * https://leetcode.com/problems/rotate-array/
 *
 * !!! high memory usage
 *
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        int shift = k % nums.length;

        int[] res = new int[nums.length];

        if (nums.length - shift >= 0) {
            System.arraycopy(nums, 0, res, shift, nums.length - shift);
        }

        if (nums.length - (nums.length - shift) >= 0) {
            System.arraycopy(nums, nums.length - shift, res, 0, nums.length - (nums.length - shift));
        }

        System.arraycopy(res, 0, nums, 0, res.length);
    }

}
