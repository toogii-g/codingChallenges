package algorithms;

/**
 *
 * B: O(1), A: O(n), O(n)
 */
public class PositiveIntegerArrayOppositeCondition {

    public boolean isValid(int[] nums){

        for(int num: nums){
            if(num<0){
                return false;
            }
        }

        return true;
    }
}
