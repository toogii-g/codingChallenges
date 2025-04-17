package leetcode.BinaryTree;

import leetcode.binarytree.SymmetricTree;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {

    @Test
    public void test1() {
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(2, node6, node7);
        TreeNode root1 = new TreeNode(1, node2, node3);

        SymmetricTree target = new SymmetricTree();

        boolean result = target.isSymmetric(root1);

        assertTrue(result);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(2, null, node5);
        TreeNode root1 = new TreeNode(1, node2, node3);

        SymmetricTree target = new SymmetricTree();

        boolean result = target.isSymmetric(root1);

        assertFalse(result);
    }
}
