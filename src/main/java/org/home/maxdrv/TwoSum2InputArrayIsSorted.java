package org.home.maxdrv;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            indexes.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int term = target - numbers[i];
            if (indexes.containsKey(term)) {
                return new int[]{i + 1, indexes.get(term) + 1};
            }
        }

        return new int[2];
    }
}
