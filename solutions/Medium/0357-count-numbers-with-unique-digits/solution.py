# ──────────────────────────────────────────────────
# Problem  : 357. Count Numbers with Unique Digits
# Difficulty: Medium
# Tags     : Math, Dynamic Programming, Backtracking
# Link     : https://leetcode.com/problems/count-numbers-with-unique-digits/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19256000 (beats 58%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        :type n: int
        :rtype: int
        """
        choices = [9, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        ans, product = 1, 1
        
        for i in range(n if n <= 10 else 10):
            product *= choices[i]
            ans += product
            
        return ans