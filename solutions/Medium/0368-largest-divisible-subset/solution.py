# ──────────────────────────────────────────────────
# Problem  : 368. Largest Divisible Subset
# Difficulty: Medium
# Tags     : Array, Math, Dynamic Programming, Sorting
# Link     : https://leetcode.com/problems/largest-divisible-subset/
# Runtime  : 219 ms (beats 19%)
# Memory   : 19832000 (beats 16%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def largestDivisibleSubset(self, nums: List[int]) -> List[int]:
        n = len(nums)
        nums.sort()

        def dp(i, memo: dict):
            if i == n:
                return []
            if i not in memo:
                best = []
                for j in range(i+1, n):
                    if nums[j] % nums[i] == 0:
                        new = dp(j, memo)
                        if len(new) > len(best):
                            best = new
                memo[i] = [nums[i]] + best
            return memo[i]

        memo_dict = {}
        res = []
        for k in range(n):
            curr = dp(k, memo_dict)
            if len(curr) > len(res):
                res = curr
        return res