# ──────────────────────────────────────────────────
# Problem  : 263. Ugly Number
# Difficulty: Easy
# Tags     : Math
# Link     : https://leetcode.com/problems/ugly-number/
# Runtime  : 2 ms (beats 19%)
# Memory   : 12204000 (beats 90%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def isUgly(self, n):
        """:type n: int
        :rtype: bool
        """
        if n <= 0:
            return False
        
        for factor in [2, 3, 5]:
            while n % factor == 0:
                n //= factor
                
        return n == 1