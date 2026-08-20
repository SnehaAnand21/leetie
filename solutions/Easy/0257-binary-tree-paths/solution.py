# ──────────────────────────────────────────────────
# Problem  : 257. Binary Tree Paths
# Difficulty: Easy
# Tags     : String, Backtracking, Tree, Depth-First Search, Binary Tree
# Link     : https://leetcode.com/problems/binary-tree-paths/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12584000 (beats 16%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def binaryTreePaths(self, root):
        """:type root: Optional[TreeNode]
        :rtype: List[str]
        """
        result = []
        
        def dfs(node, path):
            if not node:
                return
            
            # Append current node value to path
            current_path = path + str(node.val)
            
            # If it's a leaf node, add to results
            if not node.left and not node.right:
                result.append(current_path)
                return
            
            # Otherwise, continue traversing left and right children
            if node.left:
                dfs(node.left, current_path + "->")
            if node.right:
                dfs(node.right, current_path + "->")
                
        dfs(root, "")
        return result