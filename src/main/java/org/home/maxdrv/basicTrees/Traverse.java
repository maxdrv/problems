package org.home.maxdrv.basicTrees;

import org.home.maxdrv.ds.TreeNode;

import java.util.*;

public class Traverse {

    public List<Integer> bfs(TreeNode head) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(head);
        while (!queue.isEmpty()) {

            TreeNode cur = queue.poll();
            res.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        return res;
    }

    public List<Integer> dfs(TreeNode head) {
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()) {

            TreeNode cur = stack.pop();
            res.add(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }

        return res;
    }

    public List<Integer> recursionDfs(TreeNode head) {
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
