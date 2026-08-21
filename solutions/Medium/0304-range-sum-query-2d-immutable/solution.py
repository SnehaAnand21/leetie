# ──────────────────────────────────────────────────
# Problem  : 304. Range Sum Query 2D - Immutable
# Difficulty: Medium
# Tags     : Array, Design, Matrix, Prefix Sum
# Link     : https://leetcode.com/problems/range-sum-query-2d-immutable/
# Runtime  : 180 ms (beats 58%)
# Memory   : 24644000 (beats 59%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class NumMatrix(object):
    def __init__(self, matrix):
        if not matrix or not matrix[0]:
            return
        m, n = len(matrix), len(matrix[0])
        self.prefix = [[0] * (n + 1) for _ in range(m + 1)]
        for r in range(m):
            for c in range(n):
                self.prefix[r + 1][c + 1] = matrix[r][c] + self.prefix[r + 1][c] + self.prefix[r][c + 1] - self.prefix[r][c]

    def sumRegion(self, row1, col1, row2, col2):
        return self.prefix[row2 + 1][col2 + 1] - self.prefix[row1][col2 + 1] - self.prefix[row2 + 1][col1] + self.prefix[row1][col1]