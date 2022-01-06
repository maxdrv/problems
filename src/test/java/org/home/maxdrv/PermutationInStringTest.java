package org.home.maxdrv;

import org.home.maxdrv.old.PermutationInStringV1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    @ParameterizedTest
    @MethodSource("functions")
    void test01(BiFunction<String, String, Boolean> func) {
        String s1 = "adc";
        String s2 = "dcda";
        boolean actual = func.apply(s1, s2);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("functions")
    void test02(BiFunction<String, String, Boolean> func) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean actual = func.apply(s1, s2);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("functions")
    void test03(BiFunction<String, String, Boolean> func) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean actual = func.apply(s1, s2);
        assertFalse(actual);
    }

    private static List<Arguments> functions() {
        BiFunction<String, String, Boolean> old = (s1, s2) -> new PermutationInStringV1().checkInclusion(s1, s2);

        return List.of(Arguments.of(old));
    }

}