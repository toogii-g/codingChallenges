package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void test1() {
        QuickSort tar = new QuickSort();
        int[] nums = {9, 3, 5, 1, 4, 2, 7, 6, 8, 10, 11};
        System.out.println("0:" + Arrays.toString(nums));

        tar.sort(nums);

        System.out.println(Arrays.toString(nums));

    }
}
