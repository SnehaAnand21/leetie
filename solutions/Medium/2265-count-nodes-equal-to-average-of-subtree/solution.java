// ──────────────────────────────────────────────────
// Problem  : 2265. Count Nodes Equal to Average of Subtree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 45504000 (beats 49%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return count;
    }

    // Returns an array: [sum of subtree, number of nodes in subtree]
    private int[] postOrder(TreeNode node) {
        if (node == null) {
            return new int[] { 0, 0 };
        }

        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        int currentSum = node.val + left[0] + right[0];
        int currentCount = 1 + left[1] + right[1];

        // Check if the average equals the current node's value
        if (currentSum / currentCount == node.val) {
            count++;
        }

        return new int[] { currentSum, currentCount };
    }
}