# ──────────────────────────────────────────────────
# Problem  : 278. First Bad Version
# Difficulty: Easy
# Tags     : Binary Search, Interactive
# Link     : https://leetcode.com/problems/first-bad-version/
# Runtime  : 15 ms (beats 60%)
# Memory   : 12300000 (beats 88%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def firstBadVersion(self, n):
        """:type n: int
        :rtype: int
        """
        left, right = 1, n
        
        while left < right:
            mid = left + (right - left) // 2
            if isBadVersion(mid):
                right = mid      # The first bad version is mid or to the left
            else:
                left = mid + 1   # The first bad version is to the right
                
        return left