// ──────────────────────────────────────────────────
// Problem  : 776. Split BST
// Difficulty: Medium
// Tags     : Tree, Binary Search Tree, Recursion, Binary Tree
// Link     : https://leetcode.com/problems/split-bst/
// Runtime  : 0 ms (beats 100%)
// Memory   : 65244000 (beats 80%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1) return false;
        return true;
    }
}