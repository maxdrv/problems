package org.home.maxdrv.ds;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // TODO: I need an easy way to init trees for tests
//    public TreeNode of(int headValue, Integer... values) {
//        TreeNode head = new TreeNode(headValue, null, null);
//        for (int i = 0; i < values.length; i++) {
//            Integer val = values[i];
//
//        }
//        return head;
//    }
}
