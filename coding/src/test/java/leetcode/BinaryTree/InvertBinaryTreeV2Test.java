package leetcode.BinaryTree;

import leetcode.binarytree.InvertBinaryTreev2;
import leetcode.binarytree.SameTree;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTreeV2Test {

    @Test
    public void test1() {

        TreeNode node7 = new TreeNode(3);
        TreeNode node6 = new TreeNode(1);
        TreeNode node5 = new TreeNode(9);
        TreeNode node4 = new TreeNode(6);
        TreeNode node3 = new TreeNode(7, node4, node5);
        TreeNode node2 = new TreeNode(2, node6, node7);
        TreeNode root = new TreeNode(4, node2, node3);

        InvertBinaryTreev2 target = new InvertBinaryTreev2();

        TreeNode result = target.invertTree(root);

        TreeNode node7Expected = new TreeNode(3);
        TreeNode node6Expected = new TreeNode(1);
        TreeNode node5Expected = new TreeNode(9);
        TreeNode node4Expected = new TreeNode(6);
        TreeNode node3Expected = new TreeNode(7, node5Expected, node4Expected);
        TreeNode node2Expected = new TreeNode(2, node7Expected, node6Expected);
        TreeNode rootExpected = new TreeNode(4, node3Expected, node2Expected);
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(rootExpected, result));
    }

    @Test
    public void test2() {

        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode root = new TreeNode(2, node2, node3);

        InvertBinaryTreev2 target = new InvertBinaryTreev2();

        TreeNode result = target.invertTree(root);

        TreeNode node3Expected = new TreeNode(3);
        TreeNode node2Expected = new TreeNode(1);
        TreeNode rootExpected = new TreeNode(2, node3Expected, node2Expected);
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(rootExpected, result));
    }

    @Test
    public void test3() {

        InvertBinaryTreev2 target = new InvertBinaryTreev2();

        TreeNode result = target.invertTree(null);
        assertNull(result);
    }
}
