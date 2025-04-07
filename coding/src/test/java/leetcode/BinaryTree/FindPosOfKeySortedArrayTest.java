package leetcode.BinaryTree;

import leetcode.binarytree.FindPosOfKeySortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPosOfKeySortedArrayTest {

    @Test
    public void test1() {
        FindPosOfKeySortedArray tar = new FindPosOfKeySortedArray();
        int[] nums = {5,7,7,8,8,10};
        int[] result = tar.searchRange(nums,8);

        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void test2() {
        FindPosOfKeySortedArray tar = new FindPosOfKeySortedArray();
        int[] nums = {5,7,7,8,8,10};
        int[] result = tar.searchRange(nums,6);

        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }
    @Test
    public void test3() {
        FindPosOfKeySortedArray tar = new FindPosOfKeySortedArray();
        int[] nums = {};
        int[] result = tar.searchRange(nums,0);

        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }

    @Test
    public void test4() {
        FindPosOfKeySortedArray tar = new FindPosOfKeySortedArray();
        int[] nums = {1};
        int[] result = tar.searchRange(nums,1);

        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }

    @Test
    public void test5() {
        FindPosOfKeySortedArray tar = new FindPosOfKeySortedArray();
        int[] nums = {1};
        int[] result = tar.searchRange(nums,2);

        assertEquals(-1, result[0]);
        assertEquals(-1, result[1]);
    }
}