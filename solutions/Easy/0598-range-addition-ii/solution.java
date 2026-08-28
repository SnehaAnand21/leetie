// ──────────────────────────────────────────────────
// Problem  : 598. Range Addition II
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/range-addition-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 48484000 (beats 78%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        // Initially, the whole matrix is the overlapping region
        int a = m;
        int b = n;

        // Find the smallest row and column boundaries
        for (int[] ar : ops) {
            a = Math.min(a, ar[0]);
            b = Math.min(b, ar[1]);
        }

        // Cells inside the common intersection have the maximum value
        return a * b;
    }
}