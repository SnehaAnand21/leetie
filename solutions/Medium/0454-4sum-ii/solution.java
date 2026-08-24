// ──────────────────────────────────────────────────
// Problem  : 454. 4Sum II
// Difficulty: Medium
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/4sum-ii/
// Runtime  : 111 ms (beats 60%)
// Memory   : 46680000 (beats 94%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: nums1) {
            for(int b: nums2) {
                map.put(a+b, map.getOrDefault(a+b, 0)+1);
            }
        }

        for(int c: nums3) {
            for(int d: nums4) {
                res += map.getOrDefault(-(c+d), 0);
            }
        }
        return res;
    }
}