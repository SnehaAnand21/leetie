// ──────────────────────────────────────────────────
// Problem  : 2472. Maximum Number of Non-overlapping Palindrome Substrings
// Difficulty: Hard
// Tags     : Two Pointers, String, Dynamic Programming, Greedy
// Link     : https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43032000 (beats 66%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        if (k == 1)
            return n;

        int res = 0;

        for (int i = 0; i <= n - k; i++) {
            if (check(s, i, i + k - 1)) {
                res++;
                i += k - 1;
            } else if (i < n - k && check(s, i, i + k)) {
                res++;
                i += k;
            }
        }

        return res;
    }

    boolean check(String s, int l, int r) {
        for (; l < r; l++, r--)
            if (s.charAt(l) != s.charAt(r))
                return false;
        return true;
    }
}