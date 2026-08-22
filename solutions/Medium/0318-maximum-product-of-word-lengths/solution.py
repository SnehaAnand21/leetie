# ──────────────────────────────────────────────────
# Problem  : 318. Maximum Product of Word Lengths
# Difficulty: Medium
# Tags     : Array, String, Bit Manipulation
# Link     : https://leetcode.com/problems/maximum-product-of-word-lengths/
# Runtime  : 316 ms (beats 43%)
# Memory   : 22412000 (beats 29%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def maxProduct(self, words):
        d, ans = defaultdict(int), 0
        for word in words:
            for l in word:
                d[word] |= 1<<(ord(l) - 97)
                
        for w1, w2 in combinations(d.keys(), 2):
            if d[w1] & d[w2] == 0: 
                ans = max(ans, len(w1)*len(w2))
                
        return ans