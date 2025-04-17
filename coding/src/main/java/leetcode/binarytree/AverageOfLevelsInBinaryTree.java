package leetcode.binarytree;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        List<Double> result = new ArrayList<>();
        while(!q.isEmpty()){
            double qLength = q.size();
            double row = 0;
            for(int i =0; i<qLength;i++){
                TreeNode curr = q.poll();
                row+= curr.val;
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            result.add(row/qLength);
        }

        return result;
    }
}
