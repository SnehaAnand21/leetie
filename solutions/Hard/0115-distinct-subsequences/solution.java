// ──────────────────────────────────────────────────
// Problem  : 115. Distinct Subsequences
// Difficulty: Hard
// Tags     : String, Dynamic Programming
// Link     : https://leetcode.com/problems/distinct-subsequences/
// Runtime  : 9 ms (beats 96%)
// Memory   : 42892000 (beats 93%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numDistinct(String s, String t) {
        int m = t.length();

        long[] dp = new long[m + 1];
        dp[0] = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = m; j >= 1; j--) {
                if (c == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return (int) dp[m];
    }
}