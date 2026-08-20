# ──────────────────────────────────────────────────
# Problem  : 282. Expression Add Operators
# Difficulty: Hard
# Tags     : Math, String, Backtracking
# Link     : https://leetcode.com/problems/expression-add-operators/
# Runtime  : 177 ms (beats 0%)
# Memory   : 12256000 (beats 0%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def addOperators(self, num, target):
        """:type num: str
        :type target: int
        :rtype: List[str]
        """
        res = []
        
        def backtrack(index, path, eval_val, mult_val):
            # Base case: if we have consumed all digits in `num`
            if index == len(num):
                if eval_val == target:
                    res.append(path)
                return
            
            for i in range(index, len(num)):
                # Numbers cannot have leading zeros (e.g., "05" is invalid, but "0" is valid)
                if i > index and num[index] == '0':
                    break
                
                curr_str = num[index:i+1]
                curr_val = int(curr_str)
                
                if index == 0:
                    # First number added doesn't have an operator before it
                    backtrack(i + 1, curr_str, curr_val, curr_val)
                else:
                    # Try '+'
                    backtrack(i + 1, path + "+" + curr_str, eval_val + curr_val, curr_val)
                    # Try '-'
                    backtrack(i + 1, path + "-" + curr_str, eval_val - curr_val, -curr_val)
                    # Try '*' (multiplication has higher precedence, so we reverse the last operation)
                    backtrack(i + 1, path + "*" + curr_str, eval_val - mult_val + (mult_val * curr_val), mult_val * curr_val)

        backtrack(0, "", 0, 0)
        return res