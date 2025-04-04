package algorithms.dp;

class ClimbingStairsByTabulation {
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 1;

        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            int tmp = curr;
            curr = curr + prev;
            prev = tmp;
        }

        return curr;
    }
}