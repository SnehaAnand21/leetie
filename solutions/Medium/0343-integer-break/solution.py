# ──────────────────────────────────────────────────
# Problem  : 343. Integer Break
# Difficulty: Medium
# Tags     : Math, Dynamic Programming
# Link     : https://leetcode.com/problems/integer-break/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12428000 (beats 22%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

import math
class Solution(object):
    def integerBreak(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<=2:
            return 1
        elif n==3:
            return 2
        if(n%3==1):
            return int((math.pow(3,(n/3)-1))*4)
        elif(n%3==2):
            return int((math.pow(3,(n/3)))*2)
        return int(math.pow(3,n/3))