package org.home.maxdrv.basicTrees;

import org.home.maxdrv.ds.TreeNode;
import org.junit.jupiter.api.Test;

import static org.home.maxdrv.util.Asserts.assertEquals;

class CopyTreeTest {

    @Test
    void test01() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, six, seven);
        TreeNode head = new TreeNode(1, two, three);

        TreeNode actual = exec(head);
        assertEquals(head, actual);
    }

    private static TreeNode exec(TreeNode origin) {
        return new CopyTree().copy(origin);
    }
}