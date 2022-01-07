package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.home.maxdrv.util.Asserts.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void test01() {
        ListNode head = ListNode.of(1, 2);
        ListNode actual = exec(head, 1);
        assertEquals(ListNode.of(1), actual);
    }

    @Test
    void test02() {
        ListNode head = ListNode.of(1, 2);
        ListNode actual = exec(head, 2);
        assertEquals(ListNode.of(2), actual);
    }

    @Test
    void test03() {
        ListNode head = ListNode.of(1);
        ListNode actual = exec(head, 1);
        assertNull(actual);
    }

    @Test
    void test04() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode actual = exec(head, 2);
        assertEquals(ListNode.of(1, 2, 3, 5), actual);
    }

    private static ListNode exec(ListNode head, int n) {
        return new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, n);
    }

}