package org.home.maxdrv.basicTrees;

import org.home.maxdrv.ds.TreeNode;

public class CopyTree {

    public TreeNode copy(TreeNode origin) {
        TreeNode copy = new TreeNode(origin.val);
        step(origin, copy);
        return copy;
    }

    private static void step(TreeNode origin, TreeNode copy) {
        if (origin == null) {
            return;
        }
        if (origin.left != null) {
            copy.left = new TreeNode(origin.left.val);
            step(origin.left, copy.left);
        }
        if (origin.right != null) {
            copy.right = new TreeNode(origin.right.val);
            step(origin.right, copy.right);
        }
    }
}
