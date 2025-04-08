package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSelectTest {

    @Test
    public void test1() {
        QuickSelect tar = new QuickSelect();
        int[] nums = {9, 3, 5, 1, 4, 2, 7, 6, 8, 10, 11};
        System.out.println("0:" + Arrays.toString(nums));

        int k=5;
        System.out.println("K: " + k);

        int result = tar.select(nums, k);
        System.out.println(Arrays.toString(nums));
        System.out.println("Found: " + result);

    }
}
