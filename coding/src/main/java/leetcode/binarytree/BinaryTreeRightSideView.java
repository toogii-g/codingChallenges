package leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));


        while (!queue.isEmpty()) {
            int qLength = queue.size();
            for (int i = 0; i < qLength; i++) {
                TreeNode curr = queue.poll();
                if (curr != null && i + 1 == qLength) {
                    result.add(curr.val);
                }
                if (curr != null && curr.left != null) queue.offer(curr.left);
                if (curr != null && curr.right != null) queue.offer(curr.right);
            }
        }

        return result;
    }
}
