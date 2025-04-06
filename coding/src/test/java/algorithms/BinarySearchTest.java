package algorithms;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void test1(){
        int[] nums ={1,2,3,4,5,6,7,8,9};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.findNum(nums,1);
    }
}
