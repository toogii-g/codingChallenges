package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void test1() {

        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, node2, node3);

        BinaryTreeLevelOrderTraversal bTRLOT = new BinaryTreeLevelOrderTraversal();

        List<List<Integer>> result = bTRLOT.levelOrder(root);
        List<List<Integer>> expected = List.of(List.of(3),List.of(9,20),List.of(15,7));
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, null, null);

        BinaryTreeLevelOrderTraversal bTRLOT = new BinaryTreeLevelOrderTraversal();

        List<List<Integer>> result = bTRLOT.levelOrder(root);
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, result);
    }

    @Test
    public void test3() {

        BinaryTreeRightSideView bTRightSideView = new BinaryTreeRightSideView();

        List<Integer> result = bTRightSideView.rightSideView(null);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}
