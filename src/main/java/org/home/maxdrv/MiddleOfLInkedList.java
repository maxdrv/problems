package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfLInkedList {

    public ListNode middleNode(ListNode head) {

        ListNode cur = head;
        ListNode prev = head;

        int i = 1;
        while (cur.next != null) {
            cur = cur.next;
            i++;

            if (i % 2 == 0) {
                prev = prev.next;
            }
        }

        return prev;
    }

}
