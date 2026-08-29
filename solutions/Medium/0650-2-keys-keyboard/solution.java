// ──────────────────────────────────────────────────
// Problem  : 650. 2 Keys Keyboard
// Difficulty: Medium
// Tags     : Math, Dynamic Programming
// Link     : https://leetcode.com/problems/2-keys-keyboard/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42284000 (beats 51%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;
        
        int steps = 0;
        int factor = 2;
        
        while (n > 1) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
            factor++;
        }
        
        return steps;
    }
}