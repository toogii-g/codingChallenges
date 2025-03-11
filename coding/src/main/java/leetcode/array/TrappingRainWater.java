package leetcode.array;

public class TrappingRainWater {

    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        right[n - 1] = height[n - 1];
        for (int k = n - 2; k >= 0; k--) {
            right[k] = Math.max(right[k + 1], height[k]);
        }
        int storedWater = 0;
        for (int i = 0; i < n; i++) {
            int minWater = Math.min(left[i], right[i]);
            storedWater += minWater - height[i];
        }

        return storedWater;
    }

}
