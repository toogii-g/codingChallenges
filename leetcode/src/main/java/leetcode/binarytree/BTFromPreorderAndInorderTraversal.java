package leetcode.binarytree;

import java.util.HashMap;

public class BTFromPreorderAndInorderTraversal {

    int preOrderIdx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int inorderLength = inorder.length;
        for(int i =0; i< inorderLength;i++){
            map.put(inorder[i],i);
        }

        return construct(preorder, map, 0, inorderLength-1);
    }

    private TreeNode construct(int[] preorder, HashMap<Integer, Integer> map, int left, int right){
        if(left> right) return null;

        int pVal = preorder[preOrderIdx++];

        TreeNode node = new TreeNode(pVal);
        int inOrderIdx = map.get(pVal);

        node.left = construct(preorder, map, left, inOrderIdx-1);
        node.right = construct(preorder, map, inOrderIdx+1, right);

        return node;
    }

}
