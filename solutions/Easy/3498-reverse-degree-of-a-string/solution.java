// ──────────────────────────────────────────────────
// Problem  : 3498. Reverse Degree of a String
// Difficulty: Easy
// Tags     : String, Simulation
// Link     : https://leetcode.com/problems/reverse-degree-of-a-string/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44236000 (beats 18%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int reverseValue = 26 - (c - 'a');
            int position = i + 1;

            sum += reverseValue * position;
        }
        return sum;
    }
}