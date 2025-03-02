package leetcode.BinaryTree;

import leetcode.binarytree.SameTree;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode root1 = new TreeNode(3, node2, node3);

        TreeNode node14 = new TreeNode(15);
        TreeNode node15 = new TreeNode(7);
        TreeNode node12 = new TreeNode(9);
        TreeNode node13 = new TreeNode(20, node14, node15);
        TreeNode root11 = new TreeNode(3, node12, node13);

        SameTree sameTree = new SameTree();

        boolean result = sameTree.isSameTree(root1, root11);

        assertTrue(result);
    }

    @Test
    public void test2() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1, node2, node3);

        TreeNode node6 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2);
        TreeNode root4 = new TreeNode(1, node5, node6);

        SameTree sameTree = new SameTree();

        boolean result = sameTree.isSameTree(root1, root4);

        assertTrue(result);
    }
}
