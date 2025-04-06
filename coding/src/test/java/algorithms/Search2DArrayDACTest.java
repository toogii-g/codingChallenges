package algorithms;

import org.junit.jupiter.api.Test;

public class Search2DArrayDACTest {

    @Test
    public void test1() {
        int[][] nums = {{5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29}};

        Search2DArrayDAC tar = new Search2DArrayDAC();

        tar.search(nums, 17);
    }

    @Test
    public void test2() {
        int[][] nums = {{5, 7, 8, 14, 15},
                {6, 9, 13, 16, 23},
                {10, 12, 17, 22, 24},
                {11, 18, 21, 25, 28},
                {19, 20, 26, 27, 29}};

        Search2DArrayDAC tar = new Search2DArrayDAC();

        tar.search(nums, 30);
    }

    @Test
    public void test3() {
        int[][] nums = {{5, 10, 15, 20, 25},
                {6, 11, 16, 21, 26},
                {7, 12, 17, 22, 27},
                {8, 13, 18, 23, 28},
                {9, 14, 19, 24, 29}};

        Search2DArrayDAC tar = new Search2DArrayDAC();

        tar.search(nums, 18);
    }
}
