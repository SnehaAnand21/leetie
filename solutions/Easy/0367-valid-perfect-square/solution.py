# ──────────────────────────────────────────────────
# Problem  : 367. Valid Perfect Square
# Difficulty: Easy
# Tags     : Math, Binary Search
# Link     : https://leetcode.com/problems/valid-perfect-square/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19360000 (beats 21%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

import math

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        return int(math.sqrt(num)) ** 2 - math.sqrt(num) ** 2 == 0