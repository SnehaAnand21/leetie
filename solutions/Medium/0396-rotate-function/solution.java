// ──────────────────────────────────────────────────
// Problem  : 396. Rotate Function
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotate-function/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42484000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxRotateFunction(int[] nums) {

        int sum = 0;
        int maxVal = 0;

        int prevVal = 0;

        for(int i = 0; i < nums.length; i++) {
            
            sum += nums[i];
            prevVal += i * nums[i];

        }

        maxVal = prevVal;

        int k = nums.length - 1;

        for(int i = 1; i < nums.length; i++) {
            int currVal = sum - nums.length * nums[k] + prevVal;
            prevVal = currVal;

            maxVal = Math.max(maxVal, currVal);
            k--;
        }

        return maxVal;

    }
}