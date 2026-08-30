// ──────────────────────────────────────────────────
// Problem  : 687. Longest Univalue Path
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/longest-univalue-path/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42916000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        maxPath(root);
        return max > 0 ? max - 1 : 0;
    }

    int maxPath(TreeNode node) {
        if (node == null) return 0;

        int left = maxPath(node.left);
        int right = maxPath(node.right);

        int leftArrow = 0, rightArrow = 0;

        if (node.left != null && node.left.val == node.val) {
            leftArrow = left;
        }
        if (node.right != null && node.right.val == node.val) {
            rightArrow = right;
        }

        max = Math.max(max, leftArrow + rightArrow + 1);
        return Math.max(leftArrow, rightArrow) + 1;
    }
}