# ──────────────────────────────────────────────────
# Problem  : 241. Different Ways to Add Parentheses
# Difficulty: Medium
# Tags     : Math, String, Dynamic Programming, Recursion, Memoization, Bracket Sequences
# Link     : https://leetcode.com/problems/different-ways-to-add-parentheses/
# Runtime  : 0 ms (beats 100%)
# Memory   : 12672000 (beats 11%)
# Language : python
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def diffWaysToCompute(self, expression, memo=None):
        """:type expression: str
        :rtype: List[int]
        """
        if memo is None:
            memo = {}
            
        if expression in memo:
            return memo[expression]
        
        results = []
        for i, char in enumerate(expression):
            if char in "+-*":
                # Divide the expression into left and right parts
                left_results = self.diffWaysToCompute(expression[:i], memo)
                right_results = self.diffWaysToCompute(expression[i+1:], memo)
                
                # Combine results using the operator
                for l in left_results:
                    for r in right_results:
                        if char == '+':
                            results.append(l + r)
                        elif char == '-':
                            results.append(l - r)
                        elif char == '*':
                            results.append(l * r)
                            
        # Base case: if the string is just a number (no operators found)
        if not results:
            results.append(int(expression))
            
        memo[expression] = results
        return results