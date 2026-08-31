// ──────────────────────────────────────────────────
// Problem  : 763. Partition Labels
// Difficulty: Medium
// Tags     : Hash Table, Two Pointers, String, Greedy
// Link     : https://leetcode.com/problems/partition-labels/
// Runtime  : 5 ms (beats 81%)
// Memory   : 43580000 (beats 56%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        int a = 'a';

        for (char c : s.toCharArray()) {
            freq[c - a]++;
        }

        List<Integer> output = new ArrayList<>();
        int prevEnd = 0;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - a]--;

            if (isValid(prevEnd, i, s, freq)) {
                output.add(i - prevEnd + 1);
                prevEnd = i + 1;
            }
        }

        return output;
    }

    private boolean isValid(int start, int end, String s, int[] freq) {
        for (int i = start; i <= end; i++) {
            if (freq[s.charAt(i) - 'a'] != 0) return false;
        }
        return true;
    }
}