# ──────────────────────────────────────────────────
# Problem  : 260. Single Number III
# Difficulty: Medium
# Tags     : Array, Bit Manipulation
# Link     : https://leetcode.com/problems/single-number-iii/
# Runtime  : 0 ms (beats 0%)
# Memory   : 12368000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def singleNumber(self, nums):
        """:type nums: List[int]
        :rtype: List[int]
        """
        # Step 1: XOR all numbers to get xor_sum = a ^ b (where a and b are the two unique numbers)
        xor_sum = 0
        for num in nums:
            xor_sum ^= num
            
        # Step 2: Find a rightmost set bit (differing bit between a and b)
        # Using two's complement trick to isolate the lowest set bit
        diff_bit = xor_sum & (-xor_sum)
        
        # Step 3: Divide numbers into two groups based on the diff_bit and XOR them separately
        num1, num2 = 0, 0
        for num in nums:
            if num & diff_bit:
                num1 ^= num
            else:
                num2 ^= num
                
        return [num1, num2]