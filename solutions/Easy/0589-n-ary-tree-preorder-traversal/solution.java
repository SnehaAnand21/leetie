// ──────────────────────────────────────────────────
// Problem  : 589. N-ary Tree Preorder Traversal
// Difficulty: Easy
// Tags     : Stack, Tree, Depth-First Search
// Link     : https://leetcode.com/problems/n-ary-tree-preorder-traversal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46584000 (beats 35%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return ans;
        ans.add(root.val);
        for (Node child : root.children)
            preorder(child);
        return ans;
    }
}