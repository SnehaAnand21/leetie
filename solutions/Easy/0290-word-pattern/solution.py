# ──────────────────────────────────────────────────
# Problem  : 290. Word Pattern
# Difficulty: Easy
# Tags     : Hash Table, String
# Link     : https://leetcode.com/problems/word-pattern/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12544000 (beats 1%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def wordPattern(self, pattern, s):
        words = s.split()
        if len(pattern) != len(words):
            return False
        
        p_to_w = {}
        w_to_p = {}
        
        for p, w in zip(pattern, words):
            if p in p_to_w and p_to_w[p] != w:
                return False
            if w in w_to_p and w_to_p[w] != p:
                return False
            p_to_w[p] = w
            w_to_p[w] = p
            
        return True