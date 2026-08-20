# ──────────────────────────────────────────────────
# Problem  : 275. H-Index II
# Difficulty: Medium
# Tags     : Array, Binary Search
# Link     : https://leetcode.com/problems/h-index-ii/
# Runtime  : 0 ms (beats 100%)
# Memory   : 15040000 (beats 20%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def hIndex(self, citations):
        """:type citations: List[int]
        :rtype: int
        """
        n = len(citations)
        left, right = 0, n - 1
        
        while left <= right:
            mid = (left + right) // 2
            # If citations[mid] is greater than or equal to the number of papers from mid to end
            if citations[mid] >= n - mid:
                right = mid - 1  # Try to find a larger h-index on the left
            else:
                left = mid + 1   # Need more citations, look to the right
                
        return n - left