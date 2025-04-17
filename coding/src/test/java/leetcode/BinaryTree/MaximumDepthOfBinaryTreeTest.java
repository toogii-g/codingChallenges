package leetcode.BinaryTree;

import leetcode.binarytree.MaximumDepthOfBinaryTree;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode root = new TreeNode(3, node2, node3);

        MaximumDepthOfBinaryTree maxDBT = new MaximumDepthOfBinaryTree();

        int result = maxDBT.maxDepth(root);

        assertEquals(3, result);
    }

    @Test
    public void test2() {
        TreeNode node2 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node2, null);

        MaximumDepthOfBinaryTree maxDBT = new MaximumDepthOfBinaryTree();

        int result = maxDBT.maxDepth(root);

        assertEquals(2, result);
    }
}
