// ──────────────────────────────────────────────────
// Problem  : 718. Maximum Length of Repeated Subarray
// Difficulty: Medium
// Tags     : Array, Binary Search, Dynamic Programming, Sliding Window, Rolling Hash, Hash Function
// Link     : https://leetcode.com/problems/maximum-length-of-repeated-subarray/
// Runtime  : 22 ms (beats 94%)
// Memory   : 45152000 (beats 96%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(m > n){
            return findLength(nums2, nums1);
        }

        int[] dp = new int[m + 1];
        int max = 0;

        for(int i = 1; i <= n; i++){
            int prev = 0;

            for(int j = 1; j <= m; j++){
                int temp = dp[j];

                if(nums1[i - 1] == nums2[j - 1]){
                    dp[j] = 1 + prev;
                    max = Math.max(max, dp[j]);
                } else {
                    dp[j] = 0;
                }

                prev = temp;
            }
        }

        return max;
    }
}