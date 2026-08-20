# ──────────────────────────────────────────────────
# Problem  : 231. Power of Two
# Difficulty: Easy
# Tags     : Math, Bit Manipulation, Recursion
# Link     : https://leetcode.com/problems/power-of-two/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12348000 (beats 56%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def isPowerOfTwo(self, n):
        """:type n: int
        :rtype: bool
        """
        return n > 0 and (n & (n - 1)) == 0