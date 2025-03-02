package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleTest {

    @Test
    public void test1() {

        LinkedListCycle linkedListCycle= new LinkedListCycle();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        boolean result = linkedListCycle.hasCycle(node1);
        assertTrue(result);
    }

    @Test
    public void test2() {

        LinkedListCycle linkedListCycle= new LinkedListCycle();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;
        node2.next = node1;

        boolean result = linkedListCycle.hasCycle(node1);
        assertTrue(result);
    }

    @Test
    public void test3() {

        LinkedListCycle linkedListCycle= new LinkedListCycle();
        ListNode node1 = new ListNode(1);

        boolean result = linkedListCycle.hasCycle(node1);
        assertFalse(result);
    }
}
