package algorithms.graph;

import java.util.ArrayDeque;
import java.util.Queue;

class RottingFruit {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0;
        int time = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (fresh > 0 && !queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int[] curr = queue.poll();

                int r = curr[0];
                int c = curr[1];

                for (int[] dir : directions) {
                    int row = r + dir[0];
                    int column = c + dir[1];

                    if (row >= 0 && row < grid.length &&
                            column >= 0 && column < grid[0].length && grid[row][column] == 1) {
                        grid[row][column] = 2;
                        fresh--;
                        queue.offer(new int[]{row, column});
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
