package leetcode.binarytree;

import leetcode.TreeNode;

public class FlattenBinaryTreeToLinkedList {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null) return;

        flatten(root.right);
        flatten(root.left);
        root.left= null;
        root.right=prev;
        prev=root;
    }
}
