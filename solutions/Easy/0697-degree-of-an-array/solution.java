// ──────────────────────────────────────────────────
// Problem  : 697. Degree of an Array
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/degree-of-an-array/
// Runtime  : 42 ms (beats 16%)
// Memory   : 50544000 (beats 22%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : nums)
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        int f = 0;
        for (int freq : mp.values())
            f = Math.max(f, freq);

        int ans = Integer.MAX_VALUE;
        for (int key : mp.keySet()) {
            if (mp.get(key) == f) {
                int l = 0, r = nums.length - 1;
                while (l <= r) {
                    if (nums[l] == key) break;
                    l++;
                }
                while (l < r) {
                    if (nums[r] == key) break;
                    r--;
                }
                ans = Math.min(ans, r - l + 1);
            }
        }

        return ans;
    }
}