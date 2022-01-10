package org.home.maxdrv;

import org.home.maxdrv.ds.TreeNode;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 *
 * TODO: solution is slow and consumes a lot memory. fix it
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode root1Copy = new TreeNode(root1.val + root2.val);
        copyStep(root1, root1Copy);
        updateStep(root2, root1Copy);
        return root1Copy;
    }


    private static void copyStep(TreeNode origin, TreeNode copy) {
        if (origin == null) {
            return;
        }
        if (origin.left != null) {
            copy.left = new TreeNode(origin.left.val);
            copyStep(origin.left, copy.left);
        }
        if (origin.right != null) {
            copy.right = new TreeNode(origin.right.val);
            copyStep(origin.right, copy.right);
        }
    }

    private static void updateStep(TreeNode node2, TreeNode roo1Copy) {
        if (node2 == null) {
            return;
        }
        if (node2.left != null) {
            if (roo1Copy.left == null) {
                roo1Copy.left = new TreeNode(0);
            }
            roo1Copy.left.val += node2.left.val;
            updateStep(node2.left, roo1Copy.left);
        }
        if (node2.right != null) {
            if (roo1Copy.right == null) {
                roo1Copy.right = new TreeNode(0);
            }
            roo1Copy.right.val += node2.right.val;
            updateStep(node2.right, roo1Copy.right);
        }
    }

}
