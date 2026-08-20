# ──────────────────────────────────────────────────
# Problem  : 240. Search a 2D Matrix II
# Difficulty: Medium
# Tags     : Array, Binary Search, Divide and Conquer, Matrix
# Link     : https://leetcode.com/problems/search-a-2d-matrix-ii/
# Runtime  : 129 ms (beats 67%)
# Memory   : 18284000 (beats 99%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def searchMatrix(self, matrix, target):
        """:type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or not matrix[0]:
            return False
        
        m, n = len(matrix), len(matrix[0])
        row, col = 0, n - 1
        
        while row < m and col >= 0:
            current = matrix[row][col]
            if current == target:
                return True
            elif current > target:
                col -= 1
            else:
                row += 1
                
        return False