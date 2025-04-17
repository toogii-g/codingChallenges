package leetcode.binarytree;

import leetcode.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        int level = 0;
        while (!queue.isEmpty()) {
            int qLength = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qLength; i++) {
                TreeNode curr = queue.poll();
                row.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            if (level % 2 != 0) {
                Collections.reverse(row);
            }
            result.add(row);

            level++;

        }
        return result;
    }
}
