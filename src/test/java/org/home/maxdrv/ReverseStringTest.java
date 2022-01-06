package org.home.maxdrv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    @Test
    void test01() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        exec(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    void test02() {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        exec(s);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, s);
    }

    private static void exec(char[] s) {
        new ReverseString().reverseString(s);
    }

}