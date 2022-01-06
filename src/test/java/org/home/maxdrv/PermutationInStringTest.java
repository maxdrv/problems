package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void test01() {
        String s1 = "adc";
        String s2 = "dcda";
        boolean actual = exec(s1, s2);
        assertTrue(actual);
    }

    @Test
    void test02() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean actual = exec(s1, s2);
        assertTrue(actual);
    }

    @Test
    void test03() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean actual = exec(s1, s2);
        assertFalse(actual);
    }

    private static boolean exec(String s1, String s2) {
        return new PermutationInString().checkInclusion(s1, s2);
    }

}