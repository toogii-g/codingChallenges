package algorithms.graph;

class FindTownJudge {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 || trust.length == 0) return 1;
        int[] inDegree = new int[n + 1];

        for (int[] degree : trust) {
            inDegree[degree[0]]--;
            inDegree[degree[1]]++;
        }

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == n - 1) return i;
        }

        return -1;
    }
}