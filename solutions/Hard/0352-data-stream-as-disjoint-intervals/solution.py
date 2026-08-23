# ──────────────────────────────────────────────────
# Problem  : 352. Data Stream as Disjoint Intervals
# Difficulty: Hard
# Tags     : Hash Table, Binary Search, Union-Find, Design, Data Stream, Ordered Set
# Link     : https://leetcode.com/problems/data-stream-as-disjoint-intervals/
# Runtime  : 4 ms (beats 11%)
# Memory   : 19500000 (beats 75%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class SummaryRanges:
    def __init__(self):
        self.stack = deque()
        
    def dfs(self, nums):
        return list(zip(sorted(set([n for n in nums if n-1 not in nums])),
                        sorted(set([n for n in nums if n+1 not in nums]))))

    def addNum(self, val):
        self.stack.append(val)

    def getIntervals(self):
        return self.dfs(self.stack)