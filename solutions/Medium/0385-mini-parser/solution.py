# ──────────────────────────────────────────────────
# Problem  : 385. Mini Parser
# Difficulty: Medium
# Tags     : String, Stack, Depth-First Search
# Link     : https://leetcode.com/problems/mini-parser/
# Runtime  : 6 ms (beats 93%)
# Memory   : 22052000 (beats 14%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def deserialize(self, s: str) -> NestedInteger:
        if s[0] != "[":
            return NestedInteger(int(s))

        stack = []
        num = ""

        for ch in s:
            if ch == "[":
                stack.append(NestedInteger())

            elif ch == ",":
                if num:
                    stack[-1].add(NestedInteger(int(num)))
                    num = ""

            elif ch == "]":
                if num:
                    stack[-1].add(NestedInteger(int(num)))
                    num = ""

                temp = stack.pop()
                result = temp

                if stack:
                    stack[-1].add(temp)

            else:
                num += ch

        return result