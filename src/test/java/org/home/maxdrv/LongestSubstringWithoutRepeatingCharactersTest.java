package org.home.maxdrv;

import org.home.maxdrv.old.LongestSubstringWithoutRepeatingCharactersV1;
import org.home.maxdrv.util.TestFunctions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @TestFunctions
    void test01(Function<String, Integer> func) {
        String s = "abcabcbb";
        int actual = func.apply(s);
        assertEquals(3, actual);
    }

    @TestFunctions
    void test02(Function<String, Integer> func) {
        String s = "bbbbbb";
        int actual = func.apply(s);
        assertEquals(1, actual);
    }

    @TestFunctions
    void test03(Function<String, Integer> func) {
        String s = "pwwkew";
        int actual = func.apply(s);
        assertEquals(3, actual);
    }

    @TestFunctions
    void test04(Function<String, Integer> func) {
        String s = " ";
        int actual = func.apply(s);
        assertEquals(1, actual);
    }

    @TestFunctions
    void test05(Function<String, Integer> func) {
        String s = "abcdef";
        int actual = func.apply(s);
        assertEquals(6, actual);
    }

    @TestFunctions
    void test06(Function<String, Integer> func) {
        String s = "dvdf";
        int actual = func.apply(s);
        assertEquals(3, actual);
    }

    @TestFunctions
    void test07(Function<String, Integer> func) {
        String s = "abba";
        int actual = func.apply(s);
        assertEquals(2, actual);
    }

    private static List<Arguments> functions() {
        Function<String, Integer> old = (s) -> new LongestSubstringWithoutRepeatingCharactersV1().lengthOfLongestSubstring(s);
        Function<String, Integer> newOne = (s) -> new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        return List.of(Arguments.of(old), Arguments.of(newOne));
    }

}