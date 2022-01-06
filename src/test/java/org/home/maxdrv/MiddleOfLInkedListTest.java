package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.home.maxdrv.util.Asserts.assertEquals;

class MiddleOfLInkedListTest {

    @Test
    void test01() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5, null)))));

        ListNode expected =
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(5, null)));

        ListNode actual = exec(head);
        assertEquals(expected, actual);
    }

    @Test
    void test02() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6, null))))));

        ListNode expected =
                new ListNode(4,
                        new ListNode(5,
                                new ListNode(6, null)));

        ListNode actual = exec(head);
        assertEquals(expected, actual);
    }

    private static ListNode exec(ListNode head) {
        return new MiddleOfLInkedList().middleNode(head);
    }

}