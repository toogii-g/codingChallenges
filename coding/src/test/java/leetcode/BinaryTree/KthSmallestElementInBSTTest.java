package leetcode.BinaryTree;

import leetcode.binarytree.KthSmallestElementInBST;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInBSTTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1,null,node4);
        TreeNode node3 = new TreeNode(4);
        TreeNode root = new TreeNode(3, node2, node3);

        KthSmallestElementInBST target = new KthSmallestElementInBST();

        int result = target.kthSmallest(root,1);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode node6 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2,node6,null);
        TreeNode node5 = new TreeNode(4);
        TreeNode node2 = new TreeNode(3,node4,node5);
        TreeNode node3 = new TreeNode(6);
        TreeNode root = new TreeNode(5, node2, node3);

        KthSmallestElementInBST target = new KthSmallestElementInBST();

        int result = target.kthSmallest(root,3);
        int expected = 3;
        assertEquals(expected, result);
    }
}
