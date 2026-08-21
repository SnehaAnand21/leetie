# ──────────────────────────────────────────────────
# Problem  : 303. Range Sum Query - Immutable
# Difficulty: Easy
# Tags     : Array, Design, Prefix Sum
# Link     : https://leetcode.com/problems/range-sum-query-immutable/
# Runtime  : 7 ms (beats 55%)
# Memory   : 16156000 (beats 37%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class NumArray(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.prefix_sum = [0] * (len(nums) + 1)
        for i in range(len(nums)):
            self.prefix_sum[i + 1] = self.prefix_sum[i] + nums[i]

    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        return self.prefix_sum[right + 1] - self.prefix_sum[left]