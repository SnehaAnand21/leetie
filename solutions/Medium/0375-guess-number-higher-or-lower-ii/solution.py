# ──────────────────────────────────────────────────
# Problem  : 375. Guess Number Higher or Lower II
# Difficulty: Medium
# Tags     : Math, Dynamic Programming, Minimax, Game Theory
# Link     : https://leetcode.com/problems/guess-number-higher-or-lower-ii/
# Runtime  : 1963 ms (beats 49%)
# Memory   : 13180000 (beats 58%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def getMoneyAmount(self, n):
        """
        :type n: int
        :rtype: int
        """
        # dp[i][j] represents the minimum cost to guarantee a win for the range [i, j]
        dp = [[0] * (n + 1) for _ in range(n + 1)]
        
        # L is the length of the range
        for length in range(2, n + 1):
            for start in range(1, n - length + 2):
                end = start + length - 1
                dp[start][end] = float('inf')
                
                # Try every number 'k' in the range [start, end] as our guess
                for k in range(start, end):
                    # In the worst case, we take the maximum between the left and right subproblems,
                    # plus the cost 'k' of the current guess.
                    cost = k + max(dp[start][k - 1], dp[k + 1][end])
                    dp[start][end] = min(dp[start][end], cost)
                    
        return dp[1][n]