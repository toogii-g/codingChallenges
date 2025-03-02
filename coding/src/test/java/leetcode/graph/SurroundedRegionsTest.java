package leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SurroundedRegionsTest {

    @Test
    public void test1() {
        char[][] grid = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};

        SurroundedRegions target = new SurroundedRegions();

        target.solve(grid);

        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}};

        assertTrue(Arrays.deepEquals(expected, grid));
    }

    @Test
    public void test2() {
        char[][] grid = {
                {'X'}};

        SurroundedRegions target = new SurroundedRegions();

        target.solve(grid);

        char[][] expected = {
                {'X'}};

        assertTrue(Arrays.deepEquals(expected, grid));
    }
}
