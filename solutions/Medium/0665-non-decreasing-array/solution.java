// ──────────────────────────────────────────────────
// Problem  : 665. Non-decreasing Array
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/non-decreasing-array/
// Runtime  : 1 ms (beats 43%)
// Memory   : 47292000 (beats 25%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {

                count++;

                if (count > 1 )
                    return false;

                 if (i >= 2 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1]; 
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }
        return true;
    }
}