package leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CourseSchedule2Test {

    @Test
    public void test1(){
        int[][] prerequisites = {{1,0}};

        CourseSchedule2 target = new CourseSchedule2();
        int[] expected = {0,1};
        int[] result = target.findOrder(2, prerequisites);

        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2(){
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        CourseSchedule2 target = new CourseSchedule2();
        int[] expected = {0,1,2,3};
        int[] result = target.findOrder(4, prerequisites);

        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
