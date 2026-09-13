# ──────────────────────────────────────────────────
# Problem  : 835. Image Overlap
# Difficulty: Medium
# Tags     : Array, Matrix
# Link     : https://leetcode.com/problems/image-overlap/
# Runtime  : 144 ms (beats 96%)
# Memory   : 19524000 (beats 71%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def largestOverlap(self, img1: List[List[int]], img2: List[List[int]]) -> int:
        n = len(img1)
        A = [(i, j) for i in range(n) for j in range(n) if img1[i][j] == 1]
        B = [(i, j) for i in range(n) for j in range(n) if img2[i][j] == 1]
        cnt = [[0] * (2 * n) for _ in range(2 * n)]
        best = 0
        for ax, ay in A:
            for bx, by in B:
                dx = bx - ax + n
                dy = by - ay + n
                cnt[dx][dy] += 1
                best = max(best, cnt[dx][dy])
        return best