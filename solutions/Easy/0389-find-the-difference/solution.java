// ──────────────────────────────────────────────────
// Problem  : 389. Find the Difference
// Difficulty: Easy
// Tags     : Hash Table, String, Bit Manipulation, Sorting
// Link     : https://leetcode.com/problems/find-the-difference/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42820000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public char findTheDifference(String s, String t) {
        long sum = 0, diff = 0;

        for (char c : t.toCharArray()) {
            sum += c - 'a';
        }

        for (char c : s.toCharArray()) {
            diff += c - 'a';
        }

        return (char) (sum - diff + 'a');
    }
}