# ──────────────────────────────────────────────────
# Problem  : 233. Number of Digit One
# Difficulty: Hard
# Tags     : Math, Dynamic Programming, Recursion
# Link     : https://leetcode.com/problems/number-of-digit-one/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12464000 (beats 19%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def countDigitOne(self, n):
        """:type n: int
        :rtype: int
        """
        count = 0
        divider = 1
        
        while divider <= n:
            higher = n // (divider * 10)
            current = (n // divider) % 10
            lower = n % divider
            
            # Count occurrences based on the current digit
            if current == 0:
                count += higher * divider
            elif current == 1:
                count += higher * divider + (lower + 1)
            else:
                count += (higher + 1) * divider
                
            divider *= 10
            
        return count