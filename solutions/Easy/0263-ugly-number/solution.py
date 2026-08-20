# ──────────────────────────────────────────────────
# Problem  : 263. Ugly Number
# Difficulty: Easy
# Tags     : Math
# Link     : https://leetcode.com/problems/ugly-number/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12316000 (beats 0%)
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