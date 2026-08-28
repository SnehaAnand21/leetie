// ──────────────────────────────────────────────────
// Problem  : 590. N-ary Tree Postorder Traversal
// Difficulty: Easy
// Tags     : Stack, Tree, Depth-First Search
// Link     : https://leetcode.com/problems/n-ary-tree-postorder-traversal/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42668000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    public List<Integer> postorder(Node root) {

        List<Integer> arr = new ArrayList<>();

        if (root == null) {
            return arr;
        }

        for (Node child : root.children) {
            arr.addAll(postorder(child));
        }

        arr.add(root.val);

        return arr;
    }
}