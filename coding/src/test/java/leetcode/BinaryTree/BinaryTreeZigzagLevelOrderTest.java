package leetcode.BinaryTree;

import leetcode.binarytree.BinaryTreeZigzagLevelOrderTraversal;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeZigzagLevelOrderTest {

    @Test
    public void test1() {

        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, node2, node3);

        BinaryTreeZigzagLevelOrderTraversal bTRZLOT = new BinaryTreeZigzagLevelOrderTraversal();

        List<List<Integer>> result = bTRZLOT.zigzagLevelOrder(root);
        List<List<Integer>> expected = List.of(List.of(3),List.of(20,9),List.of(15,7));
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, null, null);

        BinaryTreeZigzagLevelOrderTraversal bTRZLOT = new BinaryTreeZigzagLevelOrderTraversal();

        List<List<Integer>> result = bTRZLOT.zigzagLevelOrder(root);
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, result);
    }

    @Test
    public void test3() {

        BinaryTreeZigzagLevelOrderTraversal bTRZLOT = new BinaryTreeZigzagLevelOrderTraversal();

        List<List<Integer>> result = bTRZLOT.zigzagLevelOrder(null);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}
