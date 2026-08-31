// ──────────────────────────────────────────────────
// Problem  : 771. Jewels and Stones
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/jewels-and-stones/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43224000 (beats 36%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char j : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (j == s) {
                    count++;
                }
            }
        }
        return count;
    }
}