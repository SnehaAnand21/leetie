// ──────────────────────────────────────────────────
// Problem  : 453. Minimum Moves to Equal Array Elements
// Difficulty: Medium
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42656000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minMoves(int[] nums) {
        int minNum= nums[0];
        for(int num : nums){
            minNum = Math.min(minNum , num);
        }

        int minimumMoves = 0;
        for(int num : nums){
            minimumMoves += (num - minNum);
        }
        return minimumMoves;
    }
}