# ──────────────────────────────────────────────────
# Problem  : 258. Add Digits
# Difficulty: Easy
# Tags     : Math, Simulation, Number Theory
# Link     : https://leetcode.com/problems/add-digits/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12328000 (beats 55%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def addDigits(self, num):
        """:type num: int
        :rtype: int
        """
        return 0 if num == 0 else (9 if num % 9 == 0 else num % 9)