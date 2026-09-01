// ──────────────────────────────────────────────────
// Problem  : 795. Number of Subarrays with Bounded Maximum
// Difficulty: Medium
// Tags     : Array, Two Pointers
// Link     : https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42644000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int leftPtr = 0;
        int validCount = 0;
        int answer = 0;

        for (int rightPtr = 0; rightPtr < nums.length; rightPtr++) {
            if (nums[rightPtr] > right) {
                validCount = 0;
                leftPtr = rightPtr + 1;
            } else if (nums[rightPtr] >= left) {
                validCount = rightPtr - leftPtr + 1;
            }

            answer += validCount;
        }

        return answer;
    }
}