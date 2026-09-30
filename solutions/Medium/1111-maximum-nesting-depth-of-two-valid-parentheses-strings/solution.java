// ──────────────────────────────────────────────────
// Problem  : 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
// Difficulty: Medium
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
// Runtime  : 1 ms (beats 100%)
// Memory   : 45292000 (beats 84%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution { 
    public int[] maxDepthAfterSplit(String seq) { 
        int n = seq.length();
        int[] ans = new int[n];
        int depth = 0;
        for (int i = 0; i < n; ++i) {
            if (seq.charAt(i) == '(') {
                ++depth;
                ans[i] = depth % 2;
            } else {
                ans[i] = depth % 2;
                --depth;
            }
        }
        return ans;
    } 
}