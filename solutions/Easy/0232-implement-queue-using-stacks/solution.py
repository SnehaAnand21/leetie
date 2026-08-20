# ──────────────────────────────────────────────────
# Problem  : 232. Implement Queue using Stacks
# Difficulty: Easy
# Tags     : Stack, Design, Queue
# Link     : https://leetcode.com/problems/implement-queue-using-stacks/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12196000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class MyQueue(object):

    def __init__(self):
        self.in_stack = []
        self.out_stack = []

    def push(self, x):
        """:type x: int
        :rtype: None
        """
        self.in_stack.append(x)

    def pop(self):
        """:rtype: int
        """
        self._move()
        return self.out_stack.pop()

    def peek(self):
        """:rtype: int
        """
        self._move()
        return self.out_stack[-1]

    def empty(self):
        """:rtype: bool
        """
        return not self.in_stack and not self.out_stack

    def _move(self):
        if not self.out_stack:
            while self.in_stack:
                self.out_stack.append(self.in_stack.pop())