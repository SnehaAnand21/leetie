# ──────────────────────────────────────────────────
# Problem  : 3718. Smallest Missing Multiple of K
# Difficulty: Easy
# Tags     : Array, Hash Table
# Link     : https://leetcode.com/problems/smallest-missing-multiple-of-k/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19360000 (beats 20%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        nums.sort()
        a=k
        for i in nums:
            if i==a:
                a+=k
        return a        
                
            


        