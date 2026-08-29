// ──────────────────────────────────────────────────
// Problem  : 628. Maximum Product of Three Numbers
// Difficulty: Easy
// Tags     : Array, Math, Sorting
// Link     : https://leetcode.com/problems/maximum-product-of-three-numbers/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42064000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    max = Math.max(max, nums[i] * nums[j] * nums[k]);
                }
            }
        }

        return max;
    }
}