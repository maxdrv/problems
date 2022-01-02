package org.home.maxdrv;

import org.home.maxdrv.first_bad_version.BadVersionHolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {


    @Test
    void test01() {
        int actual = exec(5, 4);
        Assertions.assertEquals(4, actual);
    }

    @Test
    void test02() {
        int actual = exec(1, 1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void test03() {
        int actual = exec(573741824, 17377999);
        Assertions.assertEquals(17377999, actual);
    }

    private int exec(int n, int bad) {
        BadVersionHolder.setBadVersionStatic(bad);
        return new FirstBadVersion().firstBadVersion(n);
    }

}