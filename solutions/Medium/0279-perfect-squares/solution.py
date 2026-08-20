# ──────────────────────────────────────────────────
# Problem  : 279. Perfect Squares
# Difficulty: Medium
# Tags     : Math, Dynamic Programming, Breadth-First Search, Knapsack Problem, Complete Knapsack
# Link     : https://leetcode.com/problems/perfect-squares/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12440000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def numSquares(self, n):
        """:type n: int
        :rtype: int
        """
        # dp[i] represents the least number of perfect square numbers that sum to i
        dp = [float('inf')] * (n + 1)
        dp[0] = 0
        
        for i in range(1, n + 1):
            j = 1
            while j * j <= i:
                dp[i] = min(dp[i], dp[i - j * j] + 1)
                j += 1
                
        return dp[n]