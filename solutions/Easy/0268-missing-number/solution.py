# ──────────────────────────────────────────────────
# Problem  : 268. Missing Number
# Difficulty: Easy
# Tags     : Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting
# Link     : https://leetcode.com/problems/missing-number/
# Runtime  : 1 ms (beats 62%)
# Memory   : 13340000 (beats 37%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def missingNumber(self, nums):
        """:type nums: List[int]
        :rtype: int
        """
        missing = len(nums)
        for i, num in enumerate(nums):
            missing ^= i ^ num
        return missing