# ──────────────────────────────────────────────────
# Problem  : 530. Minimum Absolute Difference in BST
# Difficulty: Easy
# Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
# Link     : https://leetcode.com/problems/minimum-absolute-difference-in-bst/
# Runtime  : 7 ms (beats 66%)
# Memory   : 16460000 (beats 85%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def __init__(self):
        self.prev = float('inf')
        self.ans = float('inf')
    
    def getMinimumDifference(self, root):
        self.inOrder(root)
        return self.ans
    
    def inOrder(self, root):
        if root.left:
            self.inOrder(root.left)
        
        self.ans = min(self.ans, abs(root.val - self.prev))
        self.prev = root.val
        
        if root.right:
            self.inOrder(root.right)
        