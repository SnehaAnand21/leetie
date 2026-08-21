# ──────────────────────────────────────────────────
# Problem  : 295. Find Median from Data Stream
# Difficulty: Hard
# Tags     : Two Pointers, Design, Sorting, Heap (Priority Queue), Data Stream
# Link     : https://leetcode.com/problems/find-median-from-data-stream/
# Runtime  : 570 ms (beats 75%)
# Memory   : 36268000 (beats 12%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

import heapq

class MedianFinder(object):
    def __init__(self):
        self.small = []  # max heap (stored as negative values)
        self.large = []  # min heap

    def addNum(self, num):
        if not self.small or num <= -self.small[0]:
            heapq.heappush(self.small, -num)
        else:
            heapq.heappush(self.large, num)
            
        if len(self.small) > len(self.large) + 1:
            heapq.heappush(self.large, -heapq.heappop(self.small))
        elif len(self.large) > len(self.small):
            heapq.heappush(self.small, -heapq.heappop(self.large))

    def findMedian(self):
        if len(self.small) > len(self.large):
            return float(-self.small[0])
        return (-self.small[0] + self.large[0]) / 2.0