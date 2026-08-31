// ──────────────────────────────────────────────────
// Problem  : 769. Max Chunks To Make Sorted
// Difficulty: Medium
// Tags     : Array, Stack, Greedy, Sorting, Monotonic Stack
// Link     : https://leetcode.com/problems/max-chunks-to-make-sorted/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42732000 (beats 29%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
}