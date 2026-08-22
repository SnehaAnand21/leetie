# ──────────────────────────────────────────────────
# Problem  : 330. Patching Array
# Difficulty: Hard
# Tags     : Array, Greedy
# Link     : https://leetcode.com/problems/patching-array/
# Runtime  : 3 ms (beats 33%)
# Memory   : 19420000 (beats 13%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        covered,res,i=0,0,0
        while covered<n:
            num=nums[i] if i<len(nums) else math.inf
            if num>covered+1:
                covered=covered*2+1
                res+=1
            else:
                covered+=num
                i+=1       
        return res