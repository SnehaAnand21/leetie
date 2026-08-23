// ──────────────────────────────────────────────────
// Problem  : 396. Rotate Function
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotate-function/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42664000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        
        int total = 0;
        int fn = 0;

        for(int i = 0; i< n;i++){
            total += nums[i];
            fn += i * nums[i];
        }

        int max_val = fn;

        
        for(int i = 1; i< n ;i++){
            fn = fn + total -(n*nums[n-i]);
            max_val = Math.max(max_val, fn);
        }
        return max_val;
        
    }
}