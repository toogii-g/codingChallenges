package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBSTv2Test {

    @Test
    public void test1() {
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(2, node2, node3);

        ValidateBSTv2 target = new ValidateBSTv2();

        boolean result = target.isValidBST(root);
        assertTrue(result);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4,node4,node5);
        TreeNode root = new TreeNode(5, node2, node3);

        ValidateBSTv2 target = new ValidateBSTv2();

        boolean result = target.isValidBST(root);
        assertFalse(result);
    }

    @Test
    public void test3() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode root = new TreeNode(2, node2, node3);

        ValidateBSTv2 target = new ValidateBSTv2();

        boolean result = target.isValidBST(root);
        assertFalse(result);
    }
}
