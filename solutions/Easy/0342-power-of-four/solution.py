# ──────────────────────────────────────────────────
# Problem  : 342. Power of Four
# Difficulty: Easy
# Tags     : Math, Bit Manipulation, Recursion
# Link     : https://leetcode.com/problems/power-of-four/
# Runtime  : 0 ms (beats 0%)
# Memory   : 19136000 (beats 0%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        
        if n <= 0: return False
        return  n.bit_length()%2 == 1 and n.bit_count() == 1