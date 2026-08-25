// ──────────────────────────────────────────────────
// Problem  : 540. Single Element in a Sorted Array
// Difficulty: Medium
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/single-element-in-a-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 52700000 (beats 91%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0 && nums[0] != nums[1]) {
                return nums[mid];
            }
            if (mid == n - 1 && nums[n - 1] != nums[n - 2]) {
                return nums[mid];
            }
            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            } 
            else {
                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}