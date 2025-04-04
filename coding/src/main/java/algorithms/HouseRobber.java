package algorithms;

class HouseRobber {
    public int rob(int[] nums) {
        int last = 0;
        int now = 0;

        for (int num : nums) {
            int tmp = now;
            now = Math.max(last + num, now);
            last = tmp;
        }

        return now;
    }
}