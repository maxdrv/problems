package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void test01() {
        String s = "abcabcbb";
        int actual = exec(s);
        assertEquals(3, actual);
    }

    @Test
    void test02() {
        String s = "bbbbbb";
        int actual = exec(s);
        assertEquals(1, actual);
    }

    @Test
    void test03() {
        String s = "pwwkew";
        int actual = exec(s);
        assertEquals(3, actual);
    }

    @Test
    void test04() {
        String s = " ";
        int actual = exec(s);
        assertEquals(1, actual);
    }

    @Test
    void test05() {
        String s = "abcdef";
        int actual = exec(s);
        assertEquals(6, actual);
    }

    @Test
    void test06() {
        String s = "dvdf";
        int actual = exec(s);
        assertEquals(3, actual);
    }

    @Test
    void test07() {
        String s = "abba";
        int actual = exec(s);
        assertEquals(2, actual);
    }

    private static int exec(String s) {
        return new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
    }

}