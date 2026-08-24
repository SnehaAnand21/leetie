// ──────────────────────────────────────────────────
// Problem  : 458. Poor Pigs
// Difficulty: Hard
// Tags     : Math, Dynamic Programming, Combinatorics
// Link     : https://leetcode.com/problems/poor-pigs/
// Runtime  : 0 ms (beats 0%)
// Memory   : 41932000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int base = minutesToTest / minutesToDie + 1;
        int ans = 0;
        long n = 1;

        while (n < buckets) {
            n *= base;
            ans++;
        }
        return ans;
    }
}