package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void test1() {
        ListNode left1 = new ListNode(1);
        ListNode left2 = new ListNode(2);
        ListNode left3 = new ListNode(4);

        left1.next = left2;
        left2.next = left3;
        left3.next = null;

        ListNode right1 = new ListNode(1);
        ListNode right2 = new ListNode(3);
        ListNode right3 = new ListNode(4);

        right1.next = right2;
        right2.next = right3;
        right3.next = null;
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode result = mergeTwoSortedLists.mergeTwoLists(left1,right1);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    public void test2() {

    }
}
