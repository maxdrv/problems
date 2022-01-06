package org.home.maxdrv.old;

import java.util.Arrays;

/**
 *
 * https://leetcode.com/problems/permutation-in-string/
 *
 * s1 and s2 consist of lowercase English letters.
 *
 * ok, this solution almost ten time faster than
 * {@link org.home.maxdrv.old.PermutationInStringV1}
 *
 * and somehow requires 20% more memory, why?
 *
 * TODO: this solution is better but still slow and consumes a lot of memory. I need to look at the hints for this problem.
 *
 */
public class PermutationInStringV2 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] origin = toArray(s1.toCharArray(), 0, s1.length());

        char[] word2 = s2.toCharArray();
        for (int end = s1.length(); end <= word2.length; end++) {
            int start = end - s1.length();

            var candidate = toArray(word2, start, end);
            if (Arrays.equals(candidate, origin)) {
                return true;
            }
        }

        return false;
    }

    private static int[] toArray(char[] target, int start, int end) {
        int[] array = new int[26];
        for (int i = start; i < end; i++) {
            char ch = target[i];
            array[ch - 97]++;
        }
        return array;
    }

}
