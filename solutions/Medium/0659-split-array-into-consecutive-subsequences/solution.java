// ──────────────────────────────────────────────────
// Problem  : 659. Split Array into Consecutive Subsequences
// Difficulty: Medium
// Tags     : Array, Hash Table, Greedy, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/split-array-into-consecutive-subsequences/
// Runtime  : 11 ms (beats 97%)
// Memory   : 47960000 (beats 94%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isPossible(int[] nums) {
        //using greedy with min heap
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        for (int num : nums) {
            while (!heap.isEmpty() && heap.peek()[0] < num - 1) {
                if (heap.poll()[1] < 3) {
                    return false;
                }
            }
            if (!heap.isEmpty() && heap.peek()[0] == num - 1) {
                int[] top = heap.poll();
                heap.offer(new int[] { num, top[1] + 1 });
            } else {
                heap.offer(new int[] { num, 1 });
            }

        }
        while (!heap.isEmpty()) {
            if (heap.poll()[1] < 3) {
                return false;
            }
        }
        return true;
    }
}