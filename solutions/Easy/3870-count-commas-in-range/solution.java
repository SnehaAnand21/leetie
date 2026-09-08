// ──────────────────────────────────────────────────
// Problem  : 3870. Count Commas in Range
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/count-commas-in-range/
// Runtime  : 1 ms (beats 84%)
// Memory   : 42756000 (beats 22%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countCommas(int n) {
        long answer = 0;
        long threshold = 1000;

        while (threshold <= n) {
            answer += n - threshold + 1;

            threshold *= 1000;
        }

        return (int) answer;
    }
}