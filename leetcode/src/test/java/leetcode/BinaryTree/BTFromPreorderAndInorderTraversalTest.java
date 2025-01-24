package leetcode.BinaryTree;

import leetcode.binarytree.BTFromPreorderAndInorderTraversal;
import leetcode.binarytree.BinaryTreeZigzagLevelOrderTraversal;
import leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BTFromPreorderAndInorderTraversalTest {

    @Test
    public void test1() {

        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode expectedRoot = new TreeNode(3, node2, node3);

        BTFromPreorderAndInorderTraversal  target = new BTFromPreorderAndInorderTraversal();

        TreeNode result = target.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
        assertTrue(expectedRoot.equals(result));
    }
}
