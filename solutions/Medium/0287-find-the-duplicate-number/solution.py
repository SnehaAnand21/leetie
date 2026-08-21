# ──────────────────────────────────────────────────
# Problem  : 287. Find the Duplicate Number
# Difficulty: Medium
# Tags     : Array, Two Pointers, Binary Search, Bit Manipulation, Pigeonhole Principle, Floyd's Cycle Finding Algorithm
# Link     : https://leetcode.com/problems/find-the-duplicate-number/
# Runtime  : 47 ms (beats 29%)
# Memory   : 20868000 (beats 63%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def findDuplicate(self, nums):
        tortoise = nums[0]
        hare = nums[0]
        
        while True:
            tortoise = nums[tortoise]
            hare = nums[nums[hare]]
            if tortoise == hare:
                break
                
        tortoise = nums[0]
        while tortoise != hare:
            tortoise = nums[tortoise]
            hare = nums[hare]
            
        return hare