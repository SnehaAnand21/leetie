// ──────────────────────────────────────────────────
// Problem  : 703. Kth Largest Element in a Stream
// Difficulty: Easy
// Tags     : Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream
// Link     : https://leetcode.com/problems/kth-largest-element-in-a-stream/
// Runtime  : 24 ms (beats 33%)
// Memory   : 52532000 (beats 6%)
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