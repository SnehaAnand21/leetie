// ──────────────────────────────────────────────────
// Problem  : 674. Longest Continuous Increasing Subsequence
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/longest-continuous-increasing-subsequence/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46936000 (beats 35%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int count = 1;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] < nums[i + 1]){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 1;
            }

           
        }
        
        return ans;
    }
}