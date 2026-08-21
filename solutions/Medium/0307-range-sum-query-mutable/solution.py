# ──────────────────────────────────────────────────
# Problem  : 307. Range Sum Query - Mutable
# Difficulty: Medium
# Tags     : Array, Divide and Conquer, Design, Binary Indexed Tree, Segment Tree, Sqrt Decomposition
# Link     : https://leetcode.com/problems/range-sum-query-mutable/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12332000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class NumArray(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.nums = nums
        self.tree = [0] * (len(nums) + 1)
        for i, val in enumerate(nums):
            self._add(i + 1, val)

    def _add(self, i, delta):
        while i < len(self.tree):
            self.tree[i] += delta
            i += i & (-i)

    def update(self, index, val):
        """
        :type index: int
        :type val: int
        :rtype: None
        """
        diff = val - self.nums[index]
        self.nums[index] = val
        self._add(index + 1, diff)

    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        return self._query(right + 1) - self._query(left)

    def _query(self, i):
        s = 0
        while i > 0:
            s += self.tree[i]
            i -= i & (-i)
        return s