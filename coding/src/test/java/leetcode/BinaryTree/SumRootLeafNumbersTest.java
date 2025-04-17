package leetcode.BinaryTree;

import leetcode.binarytree.SumRootLeafNumbers;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumRootLeafNumbersTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(1);
        TreeNode node2 = new TreeNode(9,node4,node5);
        TreeNode node3 = new TreeNode(0);
        TreeNode root = new TreeNode(4, node2, node3);

        SumRootLeafNumbers target = new SumRootLeafNumbers();

        int result = target.sumNumbers(root);

        assertEquals(1026, result);
    }

    @Test
    public void test2() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        SumRootLeafNumbers target = new SumRootLeafNumbers();

        int result = target.sumNumbers(root);

        assertEquals(25, result);
    }
}
