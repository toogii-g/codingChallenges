package leetcode.BinaryTree;

import leetcode.binarytree.AverageOfLevelsInBinaryTree;
import leetcode.binarytree.LowestCommonAncestorOfBT;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfBTTest {

    @Test
    public void test1() {
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(8);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(2, node8, node9);
        TreeNode node2 = new TreeNode(5, node4, node5);
        TreeNode node3 = new TreeNode(1, node6, node7);
        TreeNode root = new TreeNode(3, node2, node3);

        LowestCommonAncestorOfBT target = new LowestCommonAncestorOfBT();

        TreeNode result = target.lowestCommonAncestor(root, node2, node3);

        assertEquals(root, result);
    }

    @Test
    public void test2() {
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(8);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(2, node8, node9);
        TreeNode node2 = new TreeNode(5, node4, node5);
        TreeNode node3 = new TreeNode(1, node6, node7);
        TreeNode root = new TreeNode(3, node2, node3);

        LowestCommonAncestorOfBT target = new LowestCommonAncestorOfBT();

        TreeNode result = target.lowestCommonAncestor(root, node2, node9);

        assertEquals(node2, result);
    }

    @Test
    public void test3() {
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, node2, null);

        LowestCommonAncestorOfBT target = new LowestCommonAncestorOfBT();

        TreeNode result = target.lowestCommonAncestor(root, root, node2);

        assertEquals(root, result);
    }
}
