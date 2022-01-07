package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.home.maxdrv.util.Asserts.assertEquals;

class MiddleOfLInkedListTest {

    @Test
    void test01() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode actual = exec(head);
        assertEquals(ListNode.of(3, 4, 5), actual);
    }

    @Test
    void test02() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5, 6);
        ListNode actual = exec(head);
        assertEquals(ListNode.of(4, 5, 6), actual);
    }

    private static ListNode exec(ListNode head) {
        return new MiddleOfLInkedList().middleNode(head);
    }

}