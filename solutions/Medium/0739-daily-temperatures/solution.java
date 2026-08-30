// ──────────────────────────────────────────────────
// Problem  : 739. Daily Temperatures
// Difficulty: Medium
// Tags     : Array, Stack, Monotonic Stack
// Link     : https://leetcode.com/problems/daily-temperatures/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42672000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;        
    }
}