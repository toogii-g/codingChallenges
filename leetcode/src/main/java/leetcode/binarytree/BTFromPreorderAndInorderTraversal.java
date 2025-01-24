package leetcode.binarytree;

import java.util.HashMap;

public class BTFromPreorderAndInorderTraversal {
    private int preorderIdx =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int len = inorder.length;

        for(int i =0; i< inorder.length; i++){
            map.put(inorder[i],i);
        }

        return construct(preorder, map,0, len-1);
    }

    private TreeNode construct(int[] preorder,HashMap<Integer,Integer> map,int left, int right){
        if(left> right) return null;

        int pval = preorder[preorderIdx];
        int inorderIdx = map.get(pval);

        TreeNode root = new TreeNode(pval);
        preorderIdx++;
        root.left = construct(preorder,map, left, inorderIdx-1);
        root.right = construct(preorder,map,inorderIdx+1, right);
        return root;
    }
}
