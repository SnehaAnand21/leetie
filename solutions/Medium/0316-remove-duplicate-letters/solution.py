# ──────────────────────────────────────────────────
# Problem  : 316. Remove Duplicate Letters
# Difficulty: Medium
# Tags     : String, Stack, Greedy, Monotonic Stack
# Link     : https://leetcode.com/problems/remove-duplicate-letters/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19456000 (beats 16%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def removeDuplicateLetters(self, s):
        last_occ = {c: i for i, c in enumerate(s)}
        stack = ["!"]
        Visited = set()
        
        for i, symbol in enumerate(s):
            if symbol in Visited: continue
            
            while (symbol < stack[-1] and last_occ[stack[-1]] > i):
                Visited.remove(stack.pop())
           
            stack.append(symbol)
            Visited.add(symbol)        
        return "".join(stack)[1:]