package leetcode.binarytree;

import leetcode.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return checkSum(root, targetSum, 0);
    }

    private boolean checkSum(TreeNode node, int targetSum, int prevVal) {
        if (node.left == null && node.right == null) {
            if (prevVal + node.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }

        return (node.left != null && checkSum(node.left, targetSum, prevVal + node.val))
                || (node.right != null && checkSum(node.right, targetSum, prevVal + node.val));
    }
}
