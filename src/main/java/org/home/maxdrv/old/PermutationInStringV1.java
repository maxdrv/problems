package org.home.maxdrv.old;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/permutation-in-string/
 *
 * TODO: it's working but slow. Need to come up with a better solution
 *
 * thinking to substitute Map to char[]
 */
public class PermutationInStringV1 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> origin = toMap(s1.toCharArray(), 0, s1.length());

        char[] word2 = s2.toCharArray();
        for (int end = s1.length(); end <= word2.length; end++) {
            int start = end - s1.length();

            var candidate = toMap(word2, start, end);
            if (candidate.equals(origin)) {
                return true;
            }
        }

        return false;
    }

    private static Map<Character, Integer> toMap(char[] target, int start, int end) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = start; i < end; i++) {
            char ch = target[i];

            if (map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

}
