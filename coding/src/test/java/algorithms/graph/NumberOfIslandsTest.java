package algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

    @Test
    public void test1() {
        NumberOfIslands tar = new NumberOfIslands();

        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int result = tar.numIslands(grid);

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        NumberOfIslands tar = new NumberOfIslands();

        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int result = tar.numIslands(grid);

        assertEquals(3, result);
    }
}
