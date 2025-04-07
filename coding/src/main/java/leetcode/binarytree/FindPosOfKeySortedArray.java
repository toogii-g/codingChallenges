package leetcode.binarytree;

public class FindPosOfKeySortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                while (nums[left] != nums[mid] || nums[right] != nums[mid]) {
                    if (nums[left] != nums[mid]) {
                        left++;
                    }
                    if (nums[right] != nums[mid]) {
                        right--;
                    }
                }

                return new int[] { left, right };
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }
}