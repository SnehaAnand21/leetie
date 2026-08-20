# ──────────────────────────────────────────────────
# Problem  : 287. Find the Duplicate Number
# Difficulty: Medium
# Tags     : Array, Two Pointers, Binary Search, Bit Manipulation, Pigeonhole Principle, Floyd's Cycle Finding Algorithm
# Link     : https://leetcode.com/problems/find-the-duplicate-number/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12644000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def findDuplicate(self, nums):
        """:type nums: List[int]
        :rtype: int
        """
        # Phase 1: Find the intersection point of the two runners in the cycle
        slow = nums[0]
        fast = nums[0]
        
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break
                
        # Phase 2: Find the "entrance" to the cycle (the duplicate number)
        slow = nums[0]
        while slow != fast:
            slow = nums[slow]
            fast = nums[fast]
            
        return slow