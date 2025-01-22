package leetcode.binarytree;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int leftDepth = countLeftMost(root);
        int rightDepth = countRightMost(root);

        if (leftDepth == rightDepth) {
            return (int) Math.pow(2, leftDepth) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int countLeftMost(TreeNode node) {
        int depth = 0;
        while (node != null) {
            node = node.left;
            depth++;
        }

        return depth;
    }

    private int countRightMost(TreeNode node) {
        int depth = 0;
        while (node != null) {
            node = node.right;
            depth++;
        }

        return depth;
    }
}
