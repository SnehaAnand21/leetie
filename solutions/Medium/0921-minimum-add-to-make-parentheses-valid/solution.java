// ──────────────────────────────────────────────────
// Problem  : 921. Minimum Add to Make Parentheses Valid
// Difficulty: Medium
// Tags     : String, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42956000 (beats 40%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, add = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }
        return add + open;
    }
}