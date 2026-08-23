// ──────────────────────────────────────────────────
// Problem  : 377. Combination Sum IV
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/combination-sum-iv/
// Runtime  : 2 ms (beats 29%)
// Memory   : 42252000 (beats 98%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int combinationSum4(int[] nums, int target) {
        // dp[i] represents the number of possible combinations that add up to i
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }
        
        return dp[target];
    }
}