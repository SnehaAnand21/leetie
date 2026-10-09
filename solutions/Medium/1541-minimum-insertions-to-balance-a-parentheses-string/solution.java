// ──────────────────────────────────────────────────
// Problem  : 1541. Minimum Insertions to Balance a Parentheses String
// Difficulty: Medium
// Tags     : String, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
// Runtime  : 9 ms (beats 87%)
// Memory   : 47360000 (beats 86%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minInsertions(String s) {
        int ans = 0, x = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                ++x;
            } else {
                if (i < n - 1 && s.charAt(i + 1) == ')') {
                    ++i;
                } else {
                    ++ans;
                }
                if (x == 0) {
                    ++ans;
                } else {
                    --x;
                }
            }
        }
        ans += x << 1;
        return ans;
    }
}