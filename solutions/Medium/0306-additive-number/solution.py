# ──────────────────────────────────────────────────
# Problem  : 306. Additive Number
# Difficulty: Medium
# Tags     : String, Backtracking
# Link     : https://leetcode.com/problems/additive-number/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12468000 (beats 23%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def isAdditiveNumber(self, num):
        """
        :type num: str
        :rtype: bool
        """
        n = len(num)
        for i in range(1, n // 2 + 1):
            if num[0] == '0' and i > 1:
                break
            for j in range(1, n - i):
                if num[i] == '0' and j > 1:
                    break
                
                n1 = int(num[:i])
                n2 = int(num[i:i+j])
                
                curr = i + j
                while curr < n:
                    n3 = n1 + n2
                    n3_str = str(n3)
                    if not num.startswith(n3_str, curr):
                        break
                    curr += len(n3_str)
                    n1, n2 = n2, n3
                else:
                    return True
        return False