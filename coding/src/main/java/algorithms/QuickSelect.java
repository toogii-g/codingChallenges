package algorithms;

public class QuickSelect {

    public int select(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k-1);
    }

    public int quickSelect(int[] nums, int start, int stop, int k) {

        if (start == stop) return nums[start];
        int pivotIdx = medianOfThree(nums, start, stop);

        swap(nums, pivotIdx, stop);

        int left = start;
        int right = stop - 1;

        while (true) {
            while (left <= right && nums[left] <= nums[stop]) left++;
            while (left <= right && nums[right] >= nums[stop]) right--;

            if (left <= right) {
                swap(nums, left, right);
            } else {
                break;
            }
        }

        swap(nums, left, stop);

        if (left == k) {
            return nums[left];
        } else if (left > k) {
            return quickSelect(nums, start, left - 1, k);
        }

        return quickSelect(nums, left + 1, stop, k);
    }

    private int medianOfThree(int[] nums, int low, int high) {
        int mid = (low + high) / 2;

        int a = nums[low];
        int b = nums[mid];
        int c = nums[high];

        if ((a - b) * (c - a) >= 0) {
            return low;
        } else if ((b - a) * (c - b) >= 0) {
            return mid;
        } else {
            return high;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
