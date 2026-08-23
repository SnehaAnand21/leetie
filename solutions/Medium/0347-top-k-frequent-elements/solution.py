# ──────────────────────────────────────────────────
# Problem  : 347. Top K Frequent Elements
# Difficulty: Medium
# Tags     : Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect
# Link     : https://leetcode.com/problems/top-k-frequent-elements/
# Runtime  : 11 ms (beats 56%)
# Memory   : 14024000 (beats 88%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def topKFrequent(self, nums, k):
        count = {}

        for num in nums:
            count[num] = count.get(num, 0) + 1

        sorted_count = sorted(count, key=count.get, reverse = True)

        return sorted_count[:k]