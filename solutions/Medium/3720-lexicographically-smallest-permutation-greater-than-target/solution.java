// ──────────────────────────────────────────────────
// Problem  : 3720. Lexicographically Smallest Permutation Greater Than Target
// Difficulty: Medium
// Tags     : Hash Table, String, Greedy, Counting, Enumeration
// Link     : https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/
// Runtime  : 2 ms (beats 92%)
// Memory   : 45056000 (beats 50%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    private int n;
    private char[] targetChars;
    private int[] count;
    private StringBuilder result;

    public String lexGreaterPermutation(String s, String target) {
        n = s.length();
        targetChars = target.toCharArray();
        count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        result = new StringBuilder();
        if (backtrack(0, true)) {
            return result.toString();
        }
        return "";
    }

    private boolean backtrack(int index, boolean isTight) {
        if (index == n) {
            return !isTight; // If isTight is still true, it means we equaled target, which is NOT strictly greater.
        }

        int startChar = isTight ? (targetChars[index] - 'a') : 0;

        for (int c = startChar; c < 26; c++) {
            if (count[c] == 0) continue;

            count[c]--;
            result.append((char) ('a' + c));

            boolean nextIsTight = isTight && (c == (targetChars[index] - 'a'));

            if (backtrack(index + 1, nextIsTight)) {
                return true;
            }

            // Backtrack
            result.deleteCharAt(result.length() - 1);
            count[c]++;
        }

        return false;
    }
}