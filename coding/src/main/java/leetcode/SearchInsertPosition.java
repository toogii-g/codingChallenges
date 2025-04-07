package leetcode;

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length - 1, target);
    }

    public int searchInsert(int[] nums, int left, int right, int target) {
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return searchInsert(nums, left, mid - 1, target);
        }
        return searchInsert(nums, mid + 1, right, target);
    }
}