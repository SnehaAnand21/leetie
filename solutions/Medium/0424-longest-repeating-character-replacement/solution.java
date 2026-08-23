// ──────────────────────────────────────────────────
// Problem  : 424. Longest Repeating Character Replacement
// Difficulty: Medium
// Tags     : Hash Table, String, Sliding Window
// Link     : https://leetcode.com/problems/longest-repeating-character-replacement/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42684000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0;
        int maxcnt = 0;
        int maxLen = 0;

        for (int high = 0; high < s.length(); high++) {
            freq[s.charAt(high) - 'A']++;
            maxcnt = Math.max(maxcnt, freq[s.charAt(high) - 'A']);

            while ((high - low + 1) - maxcnt > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}