// ──────────────────────────────────────────────────
// Problem  : 717. 1-bit and 2-bit Characters
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/1-bit-and-2-bit-characters/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44664000 (beats 12%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while(i < n - 1)
            i += bits[i] + 1;
        return i == n - 1;
    }
}