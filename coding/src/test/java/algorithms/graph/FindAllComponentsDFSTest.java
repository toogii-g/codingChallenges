package algorithms.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FindAllComponentsDFSTest {

    @Test
    public void test1() {

        int[][] adjacencyMatrix = {
                {0, 1, 1, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        FindAllComponentsDFS tar = new FindAllComponentsDFS();

        List<List<Integer>> result = tar.findAllComponents(adjacencyMatrix);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("Component " + (i + 1) + ": " + result.get(i));
        }

    }
}
