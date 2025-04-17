package leetcode.BinaryTree;

import leetcode.binarytree.BinarySearchTreeIterator;
import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeIteratorTest {

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(20);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(15, node4, node5);
        TreeNode root = new TreeNode(7, node2, node3);

        BinarySearchTreeIterator target = new BinarySearchTreeIterator(root);

        assertEquals(3, target.next());
        assertEquals(7, target.next());
        assertTrue(target.hasNext());
        assertEquals(9, target.next());
        assertTrue(target.hasNext());
        assertEquals(15, target.next());
        assertTrue(target.hasNext());
        assertEquals(20, target.next());
        assertFalse(target.hasNext());
    }
}
