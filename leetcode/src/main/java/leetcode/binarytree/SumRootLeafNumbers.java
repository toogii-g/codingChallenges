package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class SumRootLeafNumbers {
    List<Integer> sums = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        int result = 0;
        dfs(root, 0);
        for (int num : sums) {
            result += num;
        }

        return result;
    }

    private void dfs(TreeNode node, int prev) {
        if (node == null) {
            return;
        }
        int currSum = prev * 10 + node.val;
        if (node.left == null && node.right == null) {
            sums.add(currSum);
        }
        dfs(node.left, currSum);
        dfs(node.right, currSum);
    }
}
