package algorithms.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalArrayStateAfterKMultiplicationOperationsITest {

    @Test
    public void test1(){
        int[] nums = new int[]{2,1,3,5,6};

        FinalArrayStateAfterKMultiplicationOperationsI tar = new FinalArrayStateAfterKMultiplicationOperationsI();

        int[] result = tar.getFinalState(nums,5,2);
        int[] expected = new int[]{8,4,6,5,6};
        assertArrayEquals(result,expected);

    }
}
