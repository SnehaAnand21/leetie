// ──────────────────────────────────────────────────
// Problem  : 658. Find K Closest Elements
// Difficulty: Medium
// Tags     : Array, Two Pointers, Binary Search, Sliding Window, Sorting, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/find-k-closest-elements/
// Runtime  : 4 ms (beats 97%)
// Memory   : 47792000 (beats 66%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    
    // Approach:
    // Using two pointers, we are going the 'start' and 'end' pointers towards each other,
    // until only k elements between 'start' and 'end'.
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int start = 0;
        int end = arr.length - 1;
        // Between the 'start' and 'end' pointers, inclusive, contains all the k integers that is closest to x.
        while (end - start >= k) {
            // Move 'start' to the right if 'end' is closer to x, or move 'end' to the left if 'start' is closer to x.
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        // Input all the k closest integers into the result.
        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}