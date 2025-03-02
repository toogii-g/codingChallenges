package leetcode.BinaryTree;

import leetcode.binarytree.MinimumAbsoluteDifferenceInBSTv2;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceInVTwoBSTTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode node3 = new TreeNode(6);
        TreeNode root = new TreeNode(4, node2, node3);

        MinimumAbsoluteDifferenceInBSTv2 minAbsDiffInBST = new MinimumAbsoluteDifferenceInBSTv2();

        int result = minAbsDiffInBST.getMinimumDifference(root);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(12);
        TreeNode node5 = new TreeNode(49);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(48,node4, node5);
        TreeNode root = new TreeNode(1, node2, node3);

        MinimumAbsoluteDifferenceInBSTv2 minAbsDiffInBST = new MinimumAbsoluteDifferenceInBSTv2();

        int result = minAbsDiffInBST.getMinimumDifference(root);
        int expected = 1;
        assertEquals(expected, result);
    }
}
