package leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root ==null) return result;
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));

        while(!queue.isEmpty()){
            int qLength = queue.size();
            List<Integer> sameLvlValues = new ArrayList<>();
            for(int i =0; i< qLength;i++){
                TreeNode curr = queue.poll();
                sameLvlValues.add(curr.val);
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }

            result.add(sameLvlValues);
        }

        return result;
    }
}
