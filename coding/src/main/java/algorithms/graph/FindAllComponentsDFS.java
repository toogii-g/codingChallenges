package algorithms.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindAllComponentsDFS {

    public List<List<Integer>> findAllComponents(int[][] matrix) {
        List<List<Integer>> components = new ArrayList<>();
        int n = matrix.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> vertices = new ArrayList<>();
                Stack<Integer> stack = new Stack<>();
                stack.push(i);

                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    if (!visited[node]) {
                        visited[node] = true;
                        vertices.add(node);

                        for (int k = 0; k < matrix.length; k++) {
                            if (matrix[node][k] == 1 && !visited[k]) {
                                stack.push(k);
                            }
                        }
                    }
                }

                components.add(vertices);
            }
        }

        return components;
    }
}
