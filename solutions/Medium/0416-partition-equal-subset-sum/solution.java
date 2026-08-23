// ──────────────────────────────────────────────────
// Problem  : 416. Partition Equal Subset Sum
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Knapsack Problem, 0-1 Knapsack
// Link     : https://leetcode.com/problems/partition-equal-subset-sum/
// Runtime  : 136 ms (beats 5%)
// Memory   : 129144000 (beats 5%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int S=0;
    public boolean canPartition(int[] nums) {
        for(int i :nums){
            S+=i;
        }
        if(S%2!=0) return false;
        Boolean dp[][] = new Boolean [nums.length+1][S+1];
        return solve(nums,0,nums.length-1 , 0,dp);
    }
    boolean solve(int nums[],int s , int e , int take , Boolean [][] dp){
        if(take==S/2) return true ;
        if(s>e) return false;
        if(dp[s][take]!=null) return dp[s][take];
        boolean taken = solve(nums,s+1,e,take+nums[s],dp);
        boolean nTaken = solve(nums,s+1,e,take,dp);
        return dp[s][take]=(taken||nTaken);
    }
}