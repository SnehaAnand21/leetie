// ──────────────────────────────────────────────────
// Problem  : 703. Kth Largest Element in a Stream
// Difficulty: Easy
// Tags     : Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream
// Link     : https://leetcode.com/problems/kth-largest-element-in-a-stream/
// Runtime  : 2 ms (beats 0%)
// Memory   : 42536000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class KthLargest {
    private int k;
    private PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll(); 
        }
    }
    
    public int add(int val) {
        pq.offer(val); 
        if (pq.size() > k) pq.poll();
        return pq.peek();
    }
}