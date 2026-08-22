# ──────────────────────────────────────────────────
# Problem  : 289. Game of Life
# Difficulty: Medium
# Tags     : Array, Matrix, Simulation
# Link     : https://leetcode.com/problems/game-of-life/
# Runtime  : 1 ms (beats 43%)
# Memory   : 12276000 (beats 93%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def gameOfLife(self, board):
        if not board or len(board[0]) == 0:
            return
        m, n = len(board), len(board[0])
        for i, row in enumerate(board):
            for j, ele in enumerate(row):
                count = 0
                for a in xrange(max(0, i - 1), min(i + 2, m)):
                    for b in xrange(max(0, j - 1), min(j + 2, n)):
                        if (a, b) != (i, j) and 1 <= board[a][b] <= 2:
                            count += 1
                if board[i][j] == 0:
                    if count == 3:
                        board[i][j] = 3
                else:
                    if count < 2 or count > 3:
                        board[i][j] = 2
        for i in xrange(m):
            for j in xrange(n):
                if board[i][j] == 2:
                    board[i][j] = 0
                elif board[i][j] == 3:
                    board[i][j] = 1