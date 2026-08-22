# ──────────────────────────────────────────────────
# Problem  : 324. Wiggle Sort II
# Difficulty: Medium
# Tags     : Array, Divide and Conquer, Greedy, Sorting, Quickselect
# Link     : https://leetcode.com/problems/wiggle-sort-ii/
# Runtime  : 0 ms (beats 100%)
# Memory   : 20800000 (beats 23%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def wiggleSort(self, nums):
        arr = sorted(nums)
        for i in range(1, len(nums), 2): nums[i] = arr.pop() 
        for i in range(0, len(nums), 2): nums[i] = arr.pop() 