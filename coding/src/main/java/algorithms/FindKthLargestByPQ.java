package algorithms;

import java.util.PriorityQueue;

class FindKthLargestByPQ {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i =0; i< k;i++){
            queue.offer(nums[i]);
        }

        for(int i =k;i<nums.length;i++){
            if(nums[i]> queue.peek()){
                queue.poll();
                queue.offer(nums[i]);
            }
        }

        return queue.peek();
    }
}