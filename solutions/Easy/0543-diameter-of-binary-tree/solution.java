// ──────────────────────────────────────────────────
// Problem  : 543. Diameter of Binary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/diameter-of-binary-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47096000 (beats 48%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;        
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }    
}