// ──────────────────────────────────────────────────
// Problem  : 528. Random Pick with Weight
// Difficulty: Medium
// Tags     : Array, Math, Binary Search, Prefix Sum, Randomized
// Link     : https://leetcode.com/problems/random-pick-with-weight/
// Runtime  : 24 ms (beats 93%)
// Memory   : 51776000 (beats 66%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Random;

class Solution {
    private int[] prefixSums;
    private int totalSum;
    private Random random;

    public Solution(int[] w) {
        this.prefixSums = new int[w.length];
        this.totalSum = 0;
        this.random = new Random();
        
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSums[i] = totalSum;
        }
    }
    
    public int pickIndex() {
        // Generate a random number from 1 to totalSum
        int target = random.nextInt(totalSum) + 1;
        
        // Binary search to find the correct bucket
        int left = 0, right = prefixSums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}