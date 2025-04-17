package leetcode.BinaryTree;

import leetcode.binarytree.BinaryTreeRightSideView;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSideViewTest {

    @Test
    public void test1() {

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, null, node4);
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode root = new TreeNode(1, node2, node3);

        BinaryTreeRightSideView bTRightSideView = new BinaryTreeRightSideView();

        List<Integer> result = bTRightSideView.rightSideView(root);
        List<Integer> expected = List.of(1, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4, node5, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode root = new TreeNode(1, node2, node3);

        BinaryTreeRightSideView bTRightSideView = new BinaryTreeRightSideView();

        List<Integer> result = bTRightSideView.rightSideView(root);
        List<Integer> expected = List.of(1, 3, 4, 5);
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
