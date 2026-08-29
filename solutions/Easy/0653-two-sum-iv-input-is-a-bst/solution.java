// ──────────────────────────────────────────────────
// Problem  : 653. Two Sum IV - Input is a BST
// Difficulty: Easy
// Tags     : Hash Table, Two Pointers, Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
// Runtime  : 3 ms (beats 73%)
// Memory   : 47484000 (beats 21%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        
        return check(root, k, set);
    }

    private boolean check(TreeNode root, int k, Set<Integer> set){
        if(root == null) return false;

        int need = k - root.val;
        if(set.contains(need)) return true;

        set.add(root.val);

        return check(root.left, k, set) || check(root.right, k, set);
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