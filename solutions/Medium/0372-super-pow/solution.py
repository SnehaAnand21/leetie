# ──────────────────────────────────────────────────
# Problem  : 372. Super Pow
# Difficulty: Medium
# Tags     : Math, Divide and Conquer, Euler's Totient Function, Euler's Theorem
# Link     : https://leetcode.com/problems/super-pow/
# Runtime  : 0 ms (beats 0%)
# Memory   : 19172000 (beats 0%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def superPow(self, a: int, b: List[int]) -> int:
        return pow(a,int("".join(list(map(str,b)))),1337)