package org.home.maxdrv.basicTrees;

import org.home.maxdrv.ds.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DepthFirstSearchTest {

    @Test
    void test01() {
        TreeNode head = new TreeNode(1);

        List<Integer> actual = exec(head);
        assertThat(actual).containsExactly(1);
    }

    @Test
    void test02() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, six, seven);
        TreeNode head = new TreeNode(1, two, three);

        List<Integer> actual = exec(head);
        assertThat(actual).containsExactly(1, 3, 7, 6, 2, 5, 4);
    }

    private static List<Integer> exec(TreeNode head) {
        return new DepthFirstSearch().traverse(head);
    }

}
