# ──────────────────────────────────────────────────
# Problem  : 235. Lowest Common Ancestor of a Binary Search Tree
# Difficulty: Medium
# Tags     : Tree, Depth-First Search, Binary Search Tree, Binary Tree, Binary Lifting, Lowest Common Ancestor
# Link     : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
# Runtime  : 69 ms (beats 5%)
# Memory   : 20496000 (beats 46%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """:type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        curr = root
        while curr:
            # If both nodes are smaller than curr, go left
            if p.val < curr.val and q.val < curr.val:
                curr = curr.left
            # If both nodes are greater than curr, go right
            elif p.val > curr.val and q.val > curr.val:
                curr = curr.right
            else:
                # We have found the split point (LCA)
                return curr