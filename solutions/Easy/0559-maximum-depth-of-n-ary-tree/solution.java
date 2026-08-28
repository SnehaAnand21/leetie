// ──────────────────────────────────────────────────
// Problem  : 559. Maximum Depth of N-ary Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 45244000 (beats 70%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;

        int maxHeight = 0;
        for(Node child : root.children){
            maxHeight = Math.max(maxHeight, maxDepth(child));
        }

        return 1 + maxHeight;
    }
}