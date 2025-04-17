package leetcode.binarytree;

import leetcode.TreeNode;

public class ValidateBST {
    TreeNode prev = null;
    boolean ans = true;

    public boolean isValidBST(TreeNode root) {
        validateBST(root);
        return ans;
    }

    private void validateBST(TreeNode node) {
        if (node == null || !ans) return;

        validateBST(node.left);
        if (ans && prev != null && prev.val >= node.val) {
            ans = false;
        }
        prev = node;
        validateBST(node.right);
    }
}
