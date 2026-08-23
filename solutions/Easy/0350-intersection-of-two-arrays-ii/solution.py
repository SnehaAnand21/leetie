# ──────────────────────────────────────────────────
# Problem  : 350. Intersection of Two Arrays II
# Difficulty: Easy
# Tags     : Array, Hash Table, Two Pointers, Binary Search, Sorting
# Link     : https://leetcode.com/problems/intersection-of-two-arrays-ii/
# Runtime  : 0 ms (beats 0%)
# Memory   : 19392000 (beats 0%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def intersect(self, nums1, nums2):
        nums1.sort()
        nums2.sort()
        ans = []
        i, j = 0, 0
        n, m = len(nums1), len(nums2)
        while i < n and j < m:
            if nums1[i] == nums2[j]:
                ans.append(nums1[i])
                i += 1
                j += 1
            elif nums1[i] < nums2[j]:
                i += 1
            else:
                j += 1
        return ans