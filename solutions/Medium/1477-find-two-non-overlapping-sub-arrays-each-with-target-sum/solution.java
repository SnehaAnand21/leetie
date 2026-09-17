// ──────────────────────────────────────────────────
// Problem  : 1477. Find Two Non-overlapping Sub-arrays Each With Target Sum
// Difficulty: Medium
// Tags     : Array, Hash Table, Binary Search, Dynamic Programming, Sliding Window
// Link     : https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
// Runtime  : 7 ms (beats 84%)
// Memory   : 90908000 (beats 71%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minSumOfLengths(int[] A, int k) {
        int n = A.length;
        int res = n + 1, sum = 0, i = 0;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);

        for (int j = 0; j < n; j++) {
            sum += A[j];

            while (sum > k)
                sum -= A[i++];

            dp[j + 1] = dp[j];

            if (sum == k) {
                res = Math.min(res, j - i + 1 + dp[i]);
                dp[j + 1] = Math.min(dp[j], j - i + 1);
            }
        }

        return res == n + 1 ? -1 : res;
    }
}