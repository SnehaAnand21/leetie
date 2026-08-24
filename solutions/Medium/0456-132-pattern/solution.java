// ──────────────────────────────────────────────────
// Problem  : 456. 132 Pattern
// Difficulty: Medium
// Tags     : Array, Binary Search, Stack, Monotonic Stack, Ordered Set
// Link     : https://leetcode.com/problems/132-pattern/
// Runtime  : 37 ms (beats 76%)
// Memory   : 98940000 (beats 20%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}