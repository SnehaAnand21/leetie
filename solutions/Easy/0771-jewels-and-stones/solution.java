// ──────────────────────────────────────────────────
// Problem  : 771. Jewels and Stones
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/jewels-and-stones/
// Runtime  : 1 ms (beats 60%)
// Memory   : 43376000 (beats 20%)
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