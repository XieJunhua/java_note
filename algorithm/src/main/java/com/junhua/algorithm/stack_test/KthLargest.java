package com.junhua.algorithm.stack_test;

import java.util.PriorityQueue;

public class KthLargest {

    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>(k);
        for (int n : nums) {
            queue.offer(n);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.add(val);
        } else {
            if (val > queue.peek()) {
                queue.poll();
                queue.offer(val);
            }
        }
        return queue.peek();
    }
}
