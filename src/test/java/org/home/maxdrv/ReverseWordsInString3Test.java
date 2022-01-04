package org.home.maxdrv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReverseWordsInString3Test {

    @Test
    void test01() {
        String actual = exec("Let's take LeetCode contest");
        Assertions.assertEquals("s'teL ekat edoCteeL tsetnoc", actual);
    }

    @Test
    void test02() {
        String actual = exec("God Ding");
        Assertions.assertEquals("doG gniD", actual);
    }

    private static String exec(String text) {
        return new ReverseWordsInString3().reverseWords(text);
    }

}