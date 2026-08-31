// ──────────────────────────────────────────────────
// Problem  : 779. K-th Symbol in Grammar
// Difficulty: Medium
// Tags     : Math, Bit Manipulation, Recursion
// Link     : https://leetcode.com/problems/k-th-symbol-in-grammar/
// Runtime  : 0 ms (beats 0%)
// Memory   : 41764000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;
        int length = 1 << (n - 2);
        if (k <= length) return kthGrammar(n - 1, k);
        else return 1 - kthGrammar(n - 1, k - length);
    }
}