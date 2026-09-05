# ──────────────────────────────────────────────────
# Problem  : 3904. Smallest Stable Index II
# Difficulty: Medium
# Tags     : Array, Prefix Sum
# Link     : https://leetcode.com/problems/smallest-stable-index-ii/
# Runtime  : 251 ms (beats 21%)
# Memory   : 33088000 (beats 40%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def firstStableIndex(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(nums)

        min_val = [0] * n
        min_val[n - 1] = nums[n - 1]

        for i in range(1, n):
            min_val[n - i - 1] = min(
                nums[n - i - 1],
                min_val[n - i]
            )

        max_val = nums[0]

        for i in range(n):
            max_val = max(nums[i], max_val)

            diff = max_val - min_val[i]

            if diff <= k:
                return i

        return -1