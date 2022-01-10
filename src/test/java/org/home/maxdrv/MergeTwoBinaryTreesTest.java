package org.home.maxdrv;

import org.home.maxdrv.ds.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.home.maxdrv.util.Asserts.assertEquals;

@Disabled
class MergeTwoBinaryTreesTest {

    @Test
    void test01() {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));

        TreeNode actual = exec(root1, root2);
        TreeNode expected = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));

        assertEquals(expected, actual);
    }

    @Test
    void test02() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);

        TreeNode actual = exec(root1, root2);
        TreeNode expected = new TreeNode(2, new TreeNode(2), null);

        assertEquals(expected, actual);
    }

    private static TreeNode exec(TreeNode root1, TreeNode root2) {
        return new MergeTwoBinaryTrees().mergeTrees(root1, root2);
    }

}