// ──────────────────────────────────────────────────
// Problem  : 20. Valid Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/valid-parentheses/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43180000 (beats 72%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        char[] stack = new char[s.length()];
        int head = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[head++] = ')';
            } else if (c == '{') {
                stack[head++] = '}';
            } else if (c == '[') {
                stack[head++] = ']';
            } else {
                if (head == 0 || stack[--head] != c) {
                    return false;
                }
            }
        }

        return head == 0;
    }
}