# ──────────────────────────────────────────────────
# Problem  : 3876. Construct Uniform Parity Array II
# Difficulty: Medium
# Tags     : Array, Math
# Link     : https://leetcode.com/problems/construct-uniform-parity-array-ii/
# Runtime  : 120 ms (beats 21%)
# Memory   : 35380000 (beats 52%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        mn = float('inf')
        for x in nums1:
            if x % 2 == 1:
                mn = min(mn, x)
        
        for x in nums1:
            if x % 2 == 0 and mn != float('inf') and x < mn:
                return False
                
        return True