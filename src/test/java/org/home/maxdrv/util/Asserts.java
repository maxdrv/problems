package org.home.maxdrv.util;

import org.home.maxdrv.ds.ListNode;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Asserts {

    public static void assertEquals(ListNode expected, ListNode actual) {
        if (expected == null && actual == null) {
            return;
        }
        Assertions.assertNotNull(expected);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(toList(expected), toList(actual));
    }

    private static List<Integer> toList(ListNode node) {
        List<Integer> list = new ArrayList<>();

        while (node.next != null) {
            list.add(node.val);
            node = node.next;
        }
        list.add(node.val);
        return list;
    }

}
