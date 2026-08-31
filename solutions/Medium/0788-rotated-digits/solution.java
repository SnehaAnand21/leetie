// ──────────────────────────────────────────────────
// Problem  : 788. Rotated Digits
// Difficulty: Medium
// Tags     : Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotated-digits/
// Runtime  : 4 ms (beats 81%)
// Memory   : 41840000 (beats 93%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            int num = i;
            boolean isValid = true;
            boolean hasChange = false;
            
            while (num > 0) {
                int digit = num % 10;
                
                if (digit == 3 || digit == 4 || digit == 7) {
                    isValid = false;
                    break;
                }
                
                if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                    hasChange = true;
                }
                
                num /= 10;
            }
            
            if (isValid && hasChange) {
                count++;
            }
        }
        
        return count;
    }
}