package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;
import org.home.maxdrv.util.Asserts;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void test01() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2, null));

        ListNode actual = exec(head, 1);
        Asserts.assertEquals(new ListNode(1, null), actual);
    }

    @Test
    void test02() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2, null));

        ListNode actual = exec(head, 2);
        Asserts.assertEquals(new ListNode(2, null), actual);
    }

    @Test
    void test03() {
        ListNode head =
                new ListNode(1, null);

        ListNode actual = exec(head, 1);
        Asserts.assertEquals(null, actual);
    }

    @Test
    void test04() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5, null)))));

        ListNode expected =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(5, null))));

        ListNode actual = exec(head, 2);
        Asserts.assertEquals(expected, actual);
    }

    private static ListNode exec(ListNode head, int n) {
        return new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
    }

}