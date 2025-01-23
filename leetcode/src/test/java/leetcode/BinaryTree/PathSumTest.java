package leetcode.BinaryTree;

import leetcode.binarytree.PathSum;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PathSumTest {

    @Test
    public void test1() {
        TreeNode node9 = new TreeNode(1);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node6 = new TreeNode(11, node7, node8);

        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4, null, node9);
        TreeNode node2 = new TreeNode(4, node6, null);
        TreeNode node3 = new TreeNode(8, node4, node5);
        TreeNode root = new TreeNode(5, node2, node3);

        PathSum target = new PathSum();

        boolean result = target.hasPathSum(root, 22);
        assertTrue(result);
    }

    @Test
    public void test2() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        PathSum target = new PathSum();

        boolean result = target.hasPathSum(root, 5);
        assertFalse(result);
    }

    @Test
    public void test3() {
        PathSum target = new PathSum();

        boolean result = target.hasPathSum(null, 0);
        assertFalse(result);
    }
}
