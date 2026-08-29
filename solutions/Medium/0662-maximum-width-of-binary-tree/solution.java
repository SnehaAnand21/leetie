// ──────────────────────────────────────────────────
// Problem  : 662. Maximum Width of Binary Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/maximum-width-of-binary-tree/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42400000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelStart = queue.peek().getValue();
            int levelEnd = 0;

            for (int i = 0; i < levelSize; i++) {
                Pair<TreeNode, Integer> entry = queue.poll();
                TreeNode node = entry.getKey();
                int position = entry.getValue();
                levelEnd = position;

                if (node.left != null) queue.offer(new Pair<>(node.left, position * 2));
                if (node.right != null) queue.offer(new Pair<>(node.right, position * 2 + 1));
            }

            maxWidth = Math.max(maxWidth, levelEnd - levelStart + 1);
        }

        return maxWidth;
    }
}