// ──────────────────────────────────────────────────
// Problem  : 740. Delete and Earn
// Difficulty: Medium
// Tags     : Array, Hash Table, Dynamic Programming
// Link     : https://leetcode.com/problems/delete-and-earn/
// Runtime  : 2 ms (beats 0%)
// Memory   : 42700000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
        }

        int maxValue = Arrays.stream(nums).max().getAsInt();
        int[] dp = new int[maxValue + 1];
        dp[0] = 0;
        dp[1] = points.getOrDefault(1, 0);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + points.getOrDefault(i, 0), dp[i - 1]);
        }

        return dp[maxValue];
    }
}