// ──────────────────────────────────────────────────
// Problem  : 1614. Maximum Nesting Depth of the Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43028000 (beats 16%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxDepth(String s) {
        int ans = 0, depth = 0;
        for (char ch : s.toCharArray()) {
            depth += ch == '(' ? 1 : ch == ')' ? -1 : 0;
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}