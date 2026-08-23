# ──────────────────────────────────────────────────
# Problem  : 341. Flatten Nested List Iterator
# Difficulty: Medium
# Tags     : Stack, Tree, Depth-First Search, Design, Queue, Iterator
# Link     : https://leetcode.com/problems/flatten-nested-list-iterator/
# Runtime  : 60 ms (beats 21%)
# Memory   : 18340000 (beats 34%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class NestedIterator(object):

    def __init__(self, nestedList):
        def gen(nestedList):
            for x in nestedList:
                if x.isInteger():
                    yield x.getInteger()
                else:
                    for y in gen(x.getList()):
                        yield y
        self.gen = gen(nestedList)

    def next(self):
        return self.value

    def hasNext(self):
        try:
            self.value = next(self.gen)
            return True
        except StopIteration:
            return False