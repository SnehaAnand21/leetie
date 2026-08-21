# ──────────────────────────────────────────────────
# Problem  : 292. Nim Game
# Difficulty: Easy
# Tags     : Math, Brainteaser, Minimax, Game Theory, Nim Game, Impartial Game
# Link     : https://leetcode.com/problems/nim-game/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12488000 (beats 18%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def canWinNim(self, n):
        """:type n: int:rtype: bool"""
        return n % 4 != 0