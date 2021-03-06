package org.home.maxdrv;

import org.home.maxdrv.old.PermutationInStringV1;
import org.home.maxdrv.old.PermutationInStringV2;
import org.home.maxdrv.util.TestFunctions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    @TestFunctions
    void test01(BiFunction<String, String, Boolean> func) {
        String s1 = "adc";
        String s2 = "dcda";
        boolean actual = func.apply(s1, s2);
        assertTrue(actual);
    }

    @TestFunctions
    void test02(BiFunction<String, String, Boolean> func) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean actual = func.apply(s1, s2);
        assertTrue(actual);
    }

    @TestFunctions
    void test03(BiFunction<String, String, Boolean> func) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean actual = func.apply(s1, s2);
        assertFalse(actual);
    }

    private static List<Arguments> functions() {
        BiFunction<String, String, Boolean> v1 = (s1, s2) -> new PermutationInStringV1().checkInclusion(s1, s2);
        BiFunction<String, String, Boolean> v2 = (s1, s2) -> new PermutationInStringV2().checkInclusion(s1, s2);
        BiFunction<String, String, Boolean> v3 = (s1, s2) -> new PermutationInString().checkInclusion(s1, s2);

        return List.of(
                Arguments.of(v1),
                Arguments.of(v2),
                Arguments.of(v3)
        );
    }

}