package org.home.maxdrv;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();

        Map<Character, Integer> current = new HashMap<>();

        int longest = 0;
        int start = 0;
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if (!current.containsKey(ch)) {
                current.put(ch, i);
            } else {
                int last = current.get(ch);
                if (last >= start) {
                    start = last + 1;
                }
                current.put(ch, i);
            }

            if (longest < 1 + i - start) {
                longest = 1 + i - start;
            }
        }

        return longest;
    }

}
