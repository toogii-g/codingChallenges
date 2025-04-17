package leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

    @Test
    public void test1() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};

        NumberOfIslands target = new NumberOfIslands();

        int result = target.numIslands(grid);

        assertEquals(1, result);
    }
}
