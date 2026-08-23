# ──────────────────────────────────────────────────
# Problem  : 349. Intersection of Two Arrays
# Difficulty: Easy
# Tags     : Array, Hash Table, Two Pointers, Binary Search, Sorting
# Link     : https://leetcode.com/problems/intersection-of-two-arrays/
# Runtime  : 11 ms (beats 18%)
# Memory   : 19284000 (beats 81%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        intersection = []
        for val in nums1:
            if val in nums2:
                intersection.append(val)
        unique = list(set(intersection))
        return unique