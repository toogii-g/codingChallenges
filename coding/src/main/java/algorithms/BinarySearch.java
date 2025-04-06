package algorithms;

/**
 * Binary Search
 * B: O(1) A: O(log n) W: O(log n)
 */
public class BinarySearch {

    public void findNum(int[] nums, int key) {
        Integer result = binarySearch(nums, 0, nums.length - 1, key);

        if (result == null) {
            System.out.println("Not found");
        } else {
            System.out.println("Found: " + result);
        }
    }

    public Integer binarySearch(int[] nums, int left, int right, int key) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        if (nums[mid] == key) {
            return nums[mid];
        }
        if (nums[mid] > key) {
            return binarySearch(nums, left, mid - 1, key);
        }
        return binarySearch(nums, mid + 1, right, key);

    }
}
