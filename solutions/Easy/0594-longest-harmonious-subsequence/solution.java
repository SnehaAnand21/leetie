// ──────────────────────────────────────────────────
// Problem  : 594. Longest Harmonious Subsequence
// Difficulty: Easy
// Tags     : Array, Hash Table, Sliding Window, Sorting, Counting
// Link     : https://leetcode.com/problems/longest-harmonious-subsequence/
// Runtime  : 16 ms (beats 90%)
// Memory   : 48320000 (beats 25%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 1, res = 0;
        while(r < nums.length) {
            int diff = nums[r] - nums[l];
            if(diff == 1) res = Math.max(res, r - l + 1);
            if(diff <= 1) r++;
            else l++;
        }

        return res;
    }
}