package leetcode.BinaryTree;

import leetcode.binarytree.FindPeakElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {

    @Test
    public void test1(){
        FindPeakElement tar = new FindPeakElement();
        int[] nums = {1,2,3,1};

        int result = tar.findPeakElement(nums);

        assertEquals(2, result);


    }
}
