package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBSTv2 {
    int min = Integer.MAX_VALUE;
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        
        findMinDiff(root);

        return min;
    }

    private void findMinDiff(TreeNode node){
        if(node == null) return;

        findMinDiff(node.left);
        if(prev!=null){
            min = Math.min(min, node.val - prev.val);
        }
        prev= node;
        findMinDiff(node.right);
    }
}
