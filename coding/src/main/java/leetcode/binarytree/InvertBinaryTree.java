package leetcode.binarytree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        invert(root);

        return root;
    }

    private void invert(TreeNode node){
        if(node==null) return;
        TreeNode tmp = node.left;
        node.left=node.right;
        node.right=tmp;
        invert(node.left);
        invert(node.right);
    }
}
