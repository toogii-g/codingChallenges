package leetcode.BinaryTree;

import leetcode.binarytree.BTFromInorderAndPostorderTraversal;
import leetcode.binarytree.BTFromPreorderAndInorderTraversal;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BTFromInorderAndPostorderTraversalTest {

    @Test
    public void test1() {

        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode expectedRoot = new TreeNode(3, node2, node3);

        BTFromInorderAndPostorderTraversal target = new BTFromInorderAndPostorderTraversal();

        TreeNode result = target.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
        assertTrue(expectedRoot.equals(result));
    }
}
