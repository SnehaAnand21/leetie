# ──────────────────────────────────────────────────
# Problem  : 1401. Circle and Rectangle Overlapping
# Difficulty: Medium
# Tags     : Math, Geometry
# Link     : https://leetcode.com/problems/circle-and-rectangle-overlapping/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19536000 (beats 5%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def checkOverlap(self, radius: int, xCenter: int, yCenter: int,
                     x1: int, y1: int, x2: int, y2: int) -> bool:

        x = max(x1, min(xCenter, x2)) - xCenter
        y = max(y1, min(yCenter, y2)) - yCenter

        return x * x + y * y <= radius * radius