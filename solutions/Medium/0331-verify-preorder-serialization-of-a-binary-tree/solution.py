# ──────────────────────────────────────────────────
# Problem  : 331. Verify Preorder Serialization of a Binary Tree
# Difficulty: Medium
# Tags     : String, Stack, Tree, Binary Tree
# Link     : https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19312000 (beats 20%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def isValidSerialization(self, preorder: str) -> bool:
        ar = preorder.split(',')
        n = len(ar)
        ct = 0
        for i in range(n-1, -1, -1):
            if ar[i] != '#': 
                if ct < 2: return False
                ct -= 2
                ct += 1
            else: ct += 1
        return ct == 1