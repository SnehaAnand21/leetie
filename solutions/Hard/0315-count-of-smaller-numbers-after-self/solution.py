# ──────────────────────────────────────────────────
# Problem  : 315. Count of Smaller Numbers After Self
# Difficulty: Hard
# Tags     : Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set, Treap
# Link     : https://leetcode.com/problems/count-of-smaller-numbers-after-self/
# Runtime  : 731 ms (beats 78%)
# Memory   : 36684000 (beats 85%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        n=len(nums)
        unique=sorted(set(nums))
        mapp={}
        for i,val in enumerate(unique):
            mapp[val]=i+1
        tree=[0]*(n+1)
        def query(i):
            ans=0
            while i>0:
                ans+=tree[i]
                i-=i&(-i)
            return ans

        def update(i,val):
            while i<=n:
                tree[i]+=val
                i+=i&(-i)
        ans=[0]*n
        for i in range(n-1,-1,-1):
            rank=mapp[nums[i]]
            ans[i]=query(rank-1)
            update(rank,1)
        return ans
