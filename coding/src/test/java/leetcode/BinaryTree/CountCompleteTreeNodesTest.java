package leetcode.BinaryTree;

import leetcode.binarytree.CountCompleteTreeNodes;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCompleteTreeNodesTest {

    @Test
    public void test1() {
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode root = new TreeNode(1, node2, node3);

        CountCompleteTreeNodes target = new CountCompleteTreeNodes();

        int result = target.countNodes(root);
        assertEquals(6, result);
    }

    @Test
    public void test2() {

        TreeNode root = new TreeNode(1);

        CountCompleteTreeNodes target = new CountCompleteTreeNodes();

        int result = target.countNodes(root);
        assertEquals(1, result);
    }

    @Test
    public void test3() {

        CountCompleteTreeNodes target = new CountCompleteTreeNodes();

        int result = target.countNodes(null);
        assertEquals(0, result);
    }
}
