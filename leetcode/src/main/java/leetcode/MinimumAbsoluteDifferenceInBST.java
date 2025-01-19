package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        extractBST(root);
        for(int i =1; i< list.size();i++){
            min = Math.min(min, Math.abs(list.get(i)-list.get(i-1)));
        }
        return min;
    }

    private void extractBST(TreeNode node){
        if(node == null) return;

        extractBST(node.left);
        list.add(node.val);
        extractBST(node.right);
    }
}
