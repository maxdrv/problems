package org.home.maxdrv.old;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * my old solution for problem
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 *
 * not as fast as new one
 * {@link org.home.maxdrv.LongestSubstringWithoutRepeatingCharacters}
 *
 * and less readable
 */
public class LongestSubstringWithoutRepeatingCharactersV1 {

    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Map<Character, Integer> indices = new HashMap<>();
        char[] word = s.toCharArray();

        int currentLength = 0;
        for (int i = 0; i < word.length; i++) {
            char c = word[i];
            if (indices.containsKey(c)) {
                if (currentLength > longest) {
                    longest = currentLength;
                }
                currentLength = 0;
                int prev = indices.get(c);
                indices.clear();
                i = prev;
                continue;
            }
            currentLength++;
            indices.put(c, i);
        }
        return Math.max(longest, currentLength);
    }

}
