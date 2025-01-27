package leetcode.binarytree;

import java.util.HashMap;

public class BTFromInorderAndPostorderTraversal {
    int postorderIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        postorderIdx = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return construct(map, postorder, 0, postorder.length - 1);
    }

    private TreeNode construct(HashMap<Integer, Integer> map, int[] postorder, int left, int right) {
        if (left > right) return null;
        int pVal = postorder[postorderIdx--];
        TreeNode node = new TreeNode(pVal);
        int inorderIdx = map.get(pVal);

        node.right = construct(map, postorder, inorderIdx + 1, right);
        node.left = construct(map, postorder, left, inorderIdx - 1);

        return node;
    }
}
