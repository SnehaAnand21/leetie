// ──────────────────────────────────────────────────
// Problem  : 4037. Maximum Valid Split Positions II
// Difficulty: Hard
// Tags     : N/A
// Link     : https://leetcode.com/problems/maximum-valid-split-positions-ii/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42548000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    private int[][] st;
    private int[] log;

    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        buildSparseTable(nums);

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], nums[i]);
        }

        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(nums[i], suffix[i + 1]);
        }

        int res = getScoreWithoutRemoval(prefix, suffix);

        for (int remove = 0; remove < n; remove++) {
            if (n == 2) {
                continue;
            }

            int leftGcd = (remove == 0) ? 0 : prefix[remove - 1];
[10,30,15,10]
[2,10,14]
[2,4]
2
1
0