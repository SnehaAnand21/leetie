# ──────────────────────────────────────────────────
# Problem  : 313. Super Ugly Number
# Difficulty: Medium
# Tags     : Array, Math, Dynamic Programming
# Link     : https://leetcode.com/problems/super-ugly-number/
# Runtime  : 3721 ms (beats 13%)
# Memory   : 640304000 (beats 6%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

import heapq
class Solution:
    def nthSuperUglyNumber(self, n: int, primes: List[int]) -> int:
        heap = [1]
        visited = set([1])

        count = 0

        while heap:
            val = heapq.heappop(heap)
            count += 1

            if count == n:
                return val

            for mult in primes:
                nxt = val * mult

                if nxt not in visited:
                    visited.add(nxt)
                    heapq.heappush(heap, nxt)