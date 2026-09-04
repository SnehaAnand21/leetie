# ──────────────────────────────────────────────────
# Problem  : 3903. Smallest Stable Index I
# Difficulty: Easy
# Tags     : Array, Prefix Sum
# Link     : https://leetcode.com/problems/smallest-stable-index-i/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19240000 (beats 71%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)
        mini = [0] * n

        mint = float('inf')
        for i in range(n - 1, -1, -1):
            if nums[i] < mint:
                mint = nums[i]
            mini[i] = mint

        maxt = 0
        for i in range(n):
            if nums[i] > maxt:
                maxt = nums[i]
            if maxt - mini[i] <= k:
                return i

        return -1