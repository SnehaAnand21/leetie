// ──────────────────────────────────────────────────
// Problem  : 563. Binary Tree Tilt
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/binary-tree-tilt/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46276000 (beats 86%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    int ans = 0;

    public int findTilt(TreeNode root) {

        solve(root);

        return ans;
    }

    public int solve(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = solve(root.left);

        int right = solve(root.right);

        ans += Math.abs(left - right);

        return root.val + left + right;
    }
}