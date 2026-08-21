# ──────────────────────────────────────────────────
# Problem  : 301. Remove Invalid Parentheses
# Difficulty: Hard
# Tags     : String, Backtracking, Breadth-First Search
# Link     : https://leetcode.com/problems/remove-invalid-parentheses/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12264000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def removeInvalidParentheses(self, s):
        def isValid(str_val):
            count = 0
            for char in str_val:
                if char == '(':
                    count += 1
                elif char == ')':
                    count -= 1
                if count < 0:
                    return False
            return count == 0

        level = {s}
        while True:
            valid = list(filter(isValid, level))
            if valid:
                return valid
            next_level = set()
            for item in level:
                for i in range(len(item)):
                    if item[i] in ('(', ')'):
                        next_level.add(item[:i] + item[i+1:])
            level = next_level


