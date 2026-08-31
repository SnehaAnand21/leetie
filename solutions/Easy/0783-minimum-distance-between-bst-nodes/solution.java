// ──────────────────────────────────────────────────
// Problem  : 783. Minimum Distance Between BST Nodes
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
// Link     : https://leetcode.com/problems/minimum-distance-between-bst-nodes/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42048000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution 
{
  public int minDiffInBST(TreeNode root) 
  {
    inorder(root);
    return ans;
  }

  private int ans = Integer.MAX_VALUE;
  private Integer pred = null;

  private void inorder(TreeNode root) 
  {
    if (root == null)
      return;

    inorder(root.left);
    if (pred != null)
      ans = Math.min(ans, root.val - pred);
    pred = root.val;
    inorder(root.right);
  }
}