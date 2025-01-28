package leetcode.BinaryTree;

import leetcode.binarytree.AverageOfLevelsInBinaryTree;
import leetcode.binarytree.FlattenBinaryTreeToLinkedList;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test1() {
        TreeNode node6 = new TreeNode(6);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(5, null, node6);
        TreeNode root = new TreeNode(1, node2, node3);

        FlattenBinaryTreeToLinkedList target = new FlattenBinaryTreeToLinkedList();

        TreeNode expectedNode6 = new TreeNode(6);
        TreeNode expectedNode3 = new TreeNode(5, null, expectedNode6);
        TreeNode expectedNode5 = new TreeNode(4, null, expectedNode3);
        TreeNode expectedNode4 = new TreeNode(3, null, expectedNode5);
        TreeNode expectedNode2 = new TreeNode(2, null, expectedNode4);
        TreeNode expectedRoot = new TreeNode(1, null, expectedNode2);
        target.flatten(root);
        assertEquals(expectedRoot, root);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(0);

        FlattenBinaryTreeToLinkedList target = new FlattenBinaryTreeToLinkedList();

        TreeNode expectedRoot = new TreeNode(0);
        target.flatten(root);
        assertEquals(expectedRoot, root);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode();

        FlattenBinaryTreeToLinkedList target = new FlattenBinaryTreeToLinkedList();

        TreeNode expectedRoot = new TreeNode();
        target.flatten(root);
        assertEquals(expectedRoot, root);
    }
}
