package leetcode.binarytree;

import leetcode.TreeNode;

public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node){
        if(node == null) return 0;

        int left = Math.max(dfs(node.left),0);
        int right = Math.max(dfs(node.right),0);

        max=Math.max(max, node.val+left+right);

        return node.val + Math.max(left, right);
    }


}
