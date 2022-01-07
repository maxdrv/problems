package org.home.maxdrv.ds;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int headValue, int... values) {
        ListNode head = new ListNode(headValue, null);
        ListNode cur = head;
        for (int value : values) {
            cur.next = new ListNode(value, null);
            cur = cur.next;
        }
        return head;
    }

}
