# ──────────────────────────────────────────────────
# Problem  : 242. Valid Anagram
# Difficulty: Easy
# Tags     : Hash Table, String, Sorting
# Link     : https://leetcode.com/problems/valid-anagram/
# Runtime  : 27 ms (beats 22%)
# Memory   : 12500000 (beats 86%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

from collections import Counter

class Solution(object):
    def isAnagram(self, s, t):
        """:type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
            
        return Counter(s) == Counter(t)