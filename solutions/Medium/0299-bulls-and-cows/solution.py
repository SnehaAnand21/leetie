# ──────────────────────────────────────────────────
# Problem  : 299. Bulls and Cows
# Difficulty: Medium
# Tags     : Hash Table, String, Counting
# Link     : https://leetcode.com/problems/bulls-and-cows/
# Runtime  : 15 ms (beats 38%)
# Memory   : 12324000 (beats 68%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def getHint(self, secret, guess):
        bulls = 0
        cows = 0
        secret_count = [0] * 10
        guess_count = [0] * 10
        
        for s, g in zip(secret, guess):
            if s == g:
                bulls += 1
            else:
                secret_count[int(s)] += 1
                guess_count[int(g)] += 1
                
        for i in range(10):
            cows += min(secret_count[i], guess_count[i])
            
        return str(bulls) + "A" + str(cows) + "B"