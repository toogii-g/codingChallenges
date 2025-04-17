package leetcode.BinaryTree;

import leetcode.binarytree.AverageOfLevelsInBinaryTree;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfLevelsInBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode root = new TreeNode(3, node2, node3);

        AverageOfLevelsInBinaryTree avgLevels = new AverageOfLevelsInBinaryTree();

        List<Double> result = avgLevels.averageOfLevels(root);
        List<Double> expected = List.of(3.0d,14.5d, 11.0d);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node2 = new TreeNode(9,node4,node5);
        TreeNode node3 = new TreeNode(20);
        TreeNode root = new TreeNode(3, node2, node3);

        AverageOfLevelsInBinaryTree avgLevels = new AverageOfLevelsInBinaryTree();

        List<Double> result = avgLevels.averageOfLevels(root);
        List<Double> expected = List.of(3.0d,14.5d, 11.0d);
        assertEquals(expected, result);
    }
}
