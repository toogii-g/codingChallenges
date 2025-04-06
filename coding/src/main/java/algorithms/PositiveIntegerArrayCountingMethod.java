package algorithms;

/**
 *
 * B: O(n), A: O(n), W: O(n)
 */
public class PositiveIntegerArrayCountingMethod {

    public boolean isValid(int[] nums){
        int count =0;

        for(int num: nums){
            if(num>0){
                count++;
            }
        }

        return count == nums.length;
    }
}
