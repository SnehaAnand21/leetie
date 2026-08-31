// ──────────────────────────────────────────────────
// Problem  : 775. Global and Local Inversions
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/global-and-local-inversions/
// Runtime  : 0 ms (beats 100%)
// Memory   : 65188000 (beats 92%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1) return false;
        return true;
    }
}