package leetcode;

public class JumpGame {
    public boolean jump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if( i > reachable ){
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);

        }
        return true;
    }
}
