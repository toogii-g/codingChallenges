package leetcode.BinaryTree;

import leetcode.binarytree.BinaryTreeMaximumPathSum;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeMaximumPathSumTest {

    @Test
    public void test1() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, node2, node3);

        BinaryTreeMaximumPathSum target = new BinaryTreeMaximumPathSum();
        int result = target.maxPathSum(root);
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9);
        TreeNode root = new TreeNode(-10, node2, node3);

        BinaryTreeMaximumPathSum target = new BinaryTreeMaximumPathSum();
        int result = target.maxPathSum(root);
        assertEquals(42, result);
    }
}
