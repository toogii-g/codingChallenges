package algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTownJudgeTest {

    @Test
    public void test1() {
        int[][] edges = new int[][]{{1, 2}};

        FindTownJudge tar = new FindTownJudge();

        int result = tar.findJudge(2, edges);

        assertEquals(2, result);
    }

    @Test
    public void test2() {
        int[][] edges = new int[][]{{1, 3}, {2, 3}};

        FindTownJudge tar = new FindTownJudge();

        int result = tar.findJudge(3, edges);

        assertEquals(3, result);
    }

    @Test
    public void test3() {
        int[][] edges = new int[][]{{1, 3}, {2, 3}, {3, 1}};

        FindTownJudge tar = new FindTownJudge();

        int result = tar.findJudge(3, edges);

        assertEquals(-1, result);
    }
}
