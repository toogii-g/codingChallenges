package leetcode;

public class JumpGameII {
    public int jump(int[] nums) {
        int n = nums.length -1;
        int jump = 0;
        int currFarthest = 0;
        int currEnd = 0;

        for(int i =0; i < n ; i++){
            currFarthest = Math.max(currFarthest, i+nums[i]);

            if(i==currEnd){
                jump++;
                currEnd = currFarthest;
            }
        }

        return jump;
    }
}
