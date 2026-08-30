// ──────────────────────────────────────────────────
// Problem  : 696. Count Binary Substrings
// Difficulty: Easy
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/count-binary-substrings/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42600000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int[] blocks = new int[n];
        int idx = 0;
        
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                blocks[idx++] = count;
                count = 1;
            }
        }
        blocks[idx++] = count;
        
        int res = 0;
        for (int i = 0; i < idx - 1; i++) {
            res += Math.min(blocks[i], blocks[i + 1]);
        }
        
        return res;
    }
}