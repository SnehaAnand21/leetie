// ──────────────────────────────────────────────────
// Problem  : 754. Reach a Number
// Difficulty: Medium
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/reach-a-number/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42144000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int reachNumber(int target) {
        int sum =0 ,steps = 0;
        if(target ==0) return 0;
        target = Math.abs(target);
        while(sum< target){
            sum+=steps;
            steps++;
        }
        
        while(((sum-target)%2!=0)){
            sum+=steps;
            steps++;
        }
        return steps-1;

    }
}