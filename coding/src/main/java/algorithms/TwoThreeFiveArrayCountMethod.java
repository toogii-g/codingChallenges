package algorithms;

public class TwoThreeFiveArrayCountMethod {

    public boolean isValidTwoThreeFiveArray(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) count++;
            if (num % 3 == 0) count++;
            if (num % 5 == 0) count++;
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) count++;
        }
        return count == nums.length;
    }
}
