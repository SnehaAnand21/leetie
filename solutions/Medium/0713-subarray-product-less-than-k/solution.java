// ──────────────────────────────────────────────────
// Problem  : 713. Subarray Product Less Than K
// Difficulty: Medium
// Tags     : Array, Binary Search, Sliding Window, Prefix Sum
// Link     : https://leetcode.com/problems/subarray-product-less-than-k/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42180000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;

        while (right < n) {
            product *= nums[right];
            while (product >= k) product /= nums[left++];
            count += 1 + (right - left);
            right++;
        }

        return count;
    }
}