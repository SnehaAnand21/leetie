# ──────────────────────────────────────────────────
# Problem  : 239. Sliding Window Maximum
# Difficulty: Hard
# Tags     : Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query
# Link     : https://leetcode.com/problems/sliding-window-maximum/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12312000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

from collections import deque

class Solution(object):
    def maxSlidingWindow(self, nums, k):
        """:type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        dq = deque()
        res = []
        
        for i in range(len(nums)):
            # Remove indices that are out of the current sliding window
            if dq and dq[0] < i - k + 1:
                dq.popleft()
                
            # Remove smaller elements from the back as they are useless
            while dq and nums[dq[-1]] < nums[i]:
                dq.pop()
                
            # Add current element's index
            dq.append(i)
            
            # The window has reached size k, record the maximum
            if i >= k - 1:
                res.append(nums[dq[0]])
                
        return res