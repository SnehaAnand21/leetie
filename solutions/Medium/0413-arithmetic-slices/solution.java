// ──────────────────────────────────────────────────
// Problem  : 413. Arithmetic Slices
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Sliding Window
// Link     : https://leetcode.com/problems/arithmetic-slices/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43256000 (beats 43%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        if (nums.length < 3)
            return 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int diff = nums[i + 1] - nums[i];
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] == diff && j - i + 1 >= 3) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}