package leetcode.BinaryTree;

import leetcode.binarytree.Node;
import leetcode.binarytree.PopulatingNextRightPointersInEachNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void test1() {

        Node node7 = new Node(7);
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3, null, node7,null);
        Node node2 = new Node(2, node4, node5,null);
        Node root = new Node(1, node2, node3,null);

        Node expectedNode7 = new Node(7);
        Node expectedNode5 = new Node(5,null,null, expectedNode7);
        Node expectedNode4 = new Node(4,null,null, expectedNode5);
        Node expectedNode3 = new Node(3, null, expectedNode7,null);
        Node expectedNode2 = new Node(2, expectedNode4, expectedNode5,expectedNode3);
        Node expectedRoot = new Node(1, expectedNode2, expectedNode3,null);

        PopulatingNextRightPointersInEachNode target = new PopulatingNextRightPointersInEachNode();

        Node result = target.connect(root);
        assertEquals(expectedRoot, result);
    }
}
