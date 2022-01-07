package org.home.maxdrv;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/permutation-in-string/
 *
 * s1 and s2 consist of lowercase English letters.
 *
 * Trying to use sliding window technic
 *
 * ten time faster and less memory usage than
 * {@link org.home.maxdrv.old.PermutationInStringV2}
 *
 * TODO: how to optimize sliding windows
 *
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        char[] word1 = s1.toCharArray();
        int[] origin = new int[26];
        for (char ch : word1) {
            origin[ch - 97]++;
        }

        int[] window = new int[26];

        char[] word2 = s2.toCharArray();
        for (int i = 0; i < word2.length; i++) {
            char cur = word2[i];
            window[cur - 97]++;

            if (i >= s1.length()) {
                char prev = word2[i - s1.length()];
                window[prev - 97]--;
            }

            if (Arrays.equals(window, origin)) {
                return true;
            }
        }

        return false;
    }
}
