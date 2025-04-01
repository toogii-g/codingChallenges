package algorithms;

public class TwoThreeFiveArrayArithmetic {

    public boolean isValidTwoThreeFiveArray(int[] nums) {

        for (int num : nums) {
            if (num % 6 == 0 || num % 10 == 0 || num % 15 == 0)
                return false;
        }

        return true;
    }
}
