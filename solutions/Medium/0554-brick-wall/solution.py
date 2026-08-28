# ──────────────────────────────────────────────────
# Problem  : 554. Brick Wall
# Difficulty: Medium
# Tags     : Array, Hash Table
# Link     : https://leetcode.com/problems/brick-wall/
# Runtime  : 15 ms (beats 24%)
# Memory   : 15828000 (beats 38%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def leastBricks(self, wall):
        """
        :type wall: List[List[int]]
        :rtype: int
        """
        d = collections.defaultdict(int)
        for line in wall:
            i = 0
            for brick in line[:-1]:
                i += brick
                d[i] += 1
        # print len(wall), d
        return len(wall)-max(d.values()+[0])