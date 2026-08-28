// ──────────────────────────────────────────────────
// Problem  : 561. Array Partition
// Difficulty: Easy
// Tags     : Array, Greedy, Sorting, Counting Sort
// Link     : https://leetcode.com/problems/array-partition/
// Runtime  : 17 ms (beats 81%)
// Memory   : 49460000 (beats 86%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}