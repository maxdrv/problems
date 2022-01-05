package org.home.maxdrv;

import org.home.maxdrv.ds.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0, head);
        ListNode slow = head, fast = head;

        int i = 0;

        while (fast.next != null) {
            fast = fast.next;

            i++;
            if (i >= n) {
                slow = slow.next;
                prev = prev.next;
            }

        }

        if (slow == head) {
            return head.next;
        }

        prev.next = slow.next;
        return head;
    }
}
