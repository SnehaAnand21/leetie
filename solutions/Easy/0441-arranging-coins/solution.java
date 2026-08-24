// ──────────────────────────────────────────────────
// Problem  : 441. Arranging Coins
// Difficulty: Easy
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/arranging-coins/
// Runtime  : 33 ms (beats 8%)
// Memory   : 42680000 (beats 64%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int arrangeCoins(int n) {
        for (long i = 1; ; i++) {
            long sum = (i * (i + 1)) / 2;
            if (sum > n) return (int)(i - 1);
            if (sum == n) return (int)i;
        }
    }
}
