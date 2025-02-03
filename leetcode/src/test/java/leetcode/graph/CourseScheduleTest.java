package leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {

    @Test
    public void test1(){
        int[][] prerequisites = {{1,0}};

        CourseSchedule target = new CourseSchedule();

        boolean result = target.canFinish(2, prerequisites);

        assertTrue(result);
    }

    @Test
    public void test2(){
        int[][] prerequisites = {{1,0},{0,1}};

        CourseSchedule target = new CourseSchedule();

        boolean result = target.canFinish(2, prerequisites);

        assertFalse(result);
    }
}
