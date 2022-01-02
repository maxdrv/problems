package org.home.maxdrv;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {

    public int search(int[] nums, int k) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] > k) {
                h = mid - 1;
            } else if (nums[mid] < k) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
