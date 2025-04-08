package algorithms;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int stop) {
        if (start >= stop) return;

        int pivotIdx = medianOfThree(nums, start, stop);

        swap(nums, pivotIdx, stop);
        int left = start;
        int right = stop - 1;
        while (true) {
            while (left <= right && nums[left] <= nums[stop]) {
                left++;
            }
            while (left <= right && nums[right] >= nums[stop]) {
                right--;
            }
            if (left <= right) {
                swap(nums, left, right);
            } else {
                break;
            }
        }

        swap(nums, stop, left);
        quickSort(nums, start, left - 1);
        quickSort(nums, left + 1, stop);
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
