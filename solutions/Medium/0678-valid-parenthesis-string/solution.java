// ──────────────────────────────────────────────────
// Problem  : 678. Valid Parenthesis String
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/valid-parenthesis-string/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42404000 (beats 92%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean checkValidString(String s) {
        int l = 0, h = 0;

        for (int i = 0; i < s.length(); i++) {
            l += s.charAt(i) == '(' ? 1 : -1;
            h += s.charAt(i) == ')' ? -1 : 1;

            if (h < 0) return false;

            l = Math.max(l, 0);
        }

        return l == 0;
    }
}