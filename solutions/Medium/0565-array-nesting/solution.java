// ──────────────────────────────────────────────────
// Problem  : 565. Array Nesting
// Difficulty: Medium
// Tags     : Array, Depth-First Search
// Link     : https://leetcode.com/problems/array-nesting/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42040000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            HashSet<Integer> hs = new HashSet<>();
            hs.add(nums[i]);
            int x = nums[i];
            while(!hs.contains(nums[x])){
                hs.add(nums[x]);
                x = nums[x];
            }
            ans = Math.max(ans , hs.size());
        }
        return ans;
    }
}