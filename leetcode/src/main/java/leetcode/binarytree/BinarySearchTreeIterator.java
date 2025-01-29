package leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator {

    Queue<Integer> queue = new LinkedList<>();

    public BinarySearchTreeIterator(TreeNode root) {
        dfs(root);
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        queue.offer(node.val);
        dfs(node.right);
    }

    public int next() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public boolean hasNext() {
        return queue.isEmpty() ? false : true;
    }
}
