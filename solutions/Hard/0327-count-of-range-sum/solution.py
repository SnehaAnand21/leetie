# ──────────────────────────────────────────────────
# Problem  : 327. Count of Range Sum
# Difficulty: Hard
# Tags     : Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set, Treap
# Link     : https://leetcode.com/problems/count-of-range-sum/
# Runtime  : 0 ms (beats 0%)
# Memory   : 19376000 (beats 0%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def countRangeSum(self, nums: List[int], lower: int, upper: int) -> int:

        # number of range sums that fit in this
        cum = [nums[0]]
        for i in range(1, len(nums)):
            cum.append(cum[-1] + nums[i])
        new_cum = sorted(cum)
        
        cum_diff = 0
        ans = 0

        for i in range(len(nums)):
            index_upper = bisect_left(new_cum, upper + cum_diff + 1)
            index_lower = bisect_right(new_cum, lower + cum_diff - 1)
            temp = index_upper - index_lower
            ans += temp # if new_cum[index_lower] > 0 or new_cum[index_upper - 1] < 0 else temp - 1
            index_pop = bisect_left(new_cum, cum[i])
            new_cum.pop(index_pop)
            
            # bisect left and bisect right on lower + cum_diff and upper + cum_diff
            cum_diff += nums[i]
        return ans
            
        
        