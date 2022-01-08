package org.home.maxdrv.util;

import org.home.maxdrv.basicTrees.DepthFirstSearch;
import org.home.maxdrv.ds.ListNode;
import org.home.maxdrv.ds.TreeNode;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Asserts {

    private static final DepthFirstSearch TRAVERSE = new DepthFirstSearch();

    public static void assertEquals(ListNode expected, ListNode actual) {
        nullCheck(expected, actual);
        Assertions.assertEquals(toList(expected), toList(actual));
    }

    public static void assertEquals(TreeNode expected, TreeNode actual) {
        nullCheck(expected, actual);
        Assertions.assertEquals(toList(expected), toList(actual));
    }

    private static void nullCheck(Object expected, Object actual) {
        if (expected == null && actual == null) {
            return;
        }
        Assertions.assertNotNull(expected);
        Assertions.assertNotNull(actual);
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

    private static List<Integer> toList(TreeNode treeNode) {
        return TRAVERSE.traverse(treeNode);
    }

}
