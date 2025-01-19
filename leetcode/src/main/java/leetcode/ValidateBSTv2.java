package leetcode;

public class ValidateBSTv2 {

    public boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBST(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (min >= node.val || max<=node.val) {
            return false;
        }

        return validateBST(node.left,min,(long) node.val)
                && validateBST(node.right,(long) node.val,max);
    }
}
