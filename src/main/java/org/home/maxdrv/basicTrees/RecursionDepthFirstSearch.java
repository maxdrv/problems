package org.home.maxdrv.basicTrees;

import org.home.maxdrv.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursionDepthFirstSearch {

    public List<Integer> traverse(TreeNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>();
        step(head, res);
        return res;
    }

    private static void step(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        step(node.left, res);
        step(node.right, res);
    }
}
