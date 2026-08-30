// ──────────────────────────────────────────────────
// Problem  : 712. Minimum ASCII Delete Sum for Two Strings
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Longest Common Subsequence
// Link     : https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42168000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[] dp = new int[n + 1];

        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] + s2.charAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            int prev = dp[0];
            dp[0] += s1.charAt(i - 1);

            for (int j = 1; j <= n; j++) {
                int temp = dp[j];

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = Math.min(dp[j] + s1.charAt(i - 1), dp[j - 1] + s2.charAt(j - 1));
                }

                prev = temp;
            }
        }

        return dp[n];        
    }
}