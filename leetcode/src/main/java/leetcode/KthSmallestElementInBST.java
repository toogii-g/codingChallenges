package leetcode;

public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[2];
        findKthSmallest(root, k, result);
        return result[1];
    }

    private void findKthSmallest(TreeNode node, int k, int[] result) {
        if (node == null || result[0] > k) return;

        findKthSmallest(node.left, k, result);
        result[0]++;
        if (result[0] == k) {
            result[1] = node.val;
            return;
        }
        findKthSmallest(node.right, k,result);
    }
}
