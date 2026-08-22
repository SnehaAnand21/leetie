# ──────────────────────────────────────────────────
# Problem  : 326. Power of Three
# Difficulty: Easy
# Tags     : Math, Recursion
# Link     : https://leetcode.com/problems/power-of-three/
# Runtime  : 0 ms (beats 0%)
# Memory   : 19260000 (beats 0%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        return n > 0 and 1162261467 % n == 0