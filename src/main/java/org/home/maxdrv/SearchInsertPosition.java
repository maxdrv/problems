package org.home.maxdrv;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    public int search(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;

        boolean more = true;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = nums[mid];

            if (midVal < k) {
                low = mid + 1;
                more = true;
            } else if (midVal > k) {
                high = mid - 1;
                more = false;
            } else
                return mid;
        }

        return more ? low : high + 1;
    }

}
