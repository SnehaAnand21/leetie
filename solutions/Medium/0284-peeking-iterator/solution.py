# ──────────────────────────────────────────────────
# Problem  : 284. Peeking Iterator
# Difficulty: Medium
# Tags     : Array, Design, Iterator
# Link     : https://leetcode.com/problems/peeking-iterator/
# Runtime  : 11 ms (beats 0%)
# Memory   : 12456000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class PeekingIterator(object):
    def __init__(self, iterator):
        """:type iterator: Iterator
        """
        self.iterator = iterator
        # Cache the next element to support peek()
        self.next_element = self.iterator.next() if self.iterator.hasNext() else None

    def peek(self):
        """:rtype: int
        """
        return self.next_element

    def next(self):
        """:rtype: int
        """
        res = self.next_element
        self.next_element = self.iterator.next() if self.iterator.hasNext() else None
        return res

    def hasNext(self):
        """:rtype: bool
        """
        return self.next_element is not None