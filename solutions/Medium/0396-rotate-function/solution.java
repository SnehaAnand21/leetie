// ──────────────────────────────────────────────────
// Problem  : 396. Rotate Function
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotate-function/
// Runtime  : 4 ms (beats 99%)
// Memory   : 91040000 (beats 84%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        
        long sum = 0;
        long F = 0;
        
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            F += (long)i * nums[i];
        }
        
        long result = F;
        
        for(int k = 1; k < n; k++) {
            F = F + sum - (long)n * nums[n - k];
            result = Math.max(result, F);
        }
        
        return (int)result;
    }
}