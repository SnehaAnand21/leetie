// ──────────────────────────────────────────────────
// Problem  : 671. Second Minimum Node In a Binary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42572000 (beats 82%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        long[] min = {root.val, Long.MAX_VALUE};

        find(root, min);

        return min[1] == Long.MAX_VALUE ? -1 : (int)min[1];
    }

    private void find(TreeNode root, long[] min) {
        if (root == null) return;

        if (root.val > min[0] && root.val < min[1]) {
            min[1] = root.val;
        }

        if (root.left != null && root.left.val < min[1]) {
            find(root.left, min);
        }

        if (root.right != null && root.right.val < min[1]) {
            find(root.right, min);
        }
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */