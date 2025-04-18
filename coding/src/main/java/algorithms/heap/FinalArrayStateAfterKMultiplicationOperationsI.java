package algorithms.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt((int[] a) ->a[0]).thenComparing(a->a[1]));

        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[] { nums[i], i });
        }

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            minHeap.offer(new int[] { curr[0] * multiplier, curr[1] });
        }

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            nums[curr[1]] = curr[0];
        }

        return nums;
    }
}