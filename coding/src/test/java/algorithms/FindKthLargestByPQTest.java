package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindKthLargestByPQTest {

    @Test
    public void test1(){
        FindKthLargestByPQ tar = new FindKthLargestByPQ();

        int result = tar.findKthLargest(new int[]{3,2,1,5,6,4}, 2);

        assertEquals(5, result);
    }
}
