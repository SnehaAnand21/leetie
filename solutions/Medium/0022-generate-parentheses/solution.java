// ──────────────────────────────────────────────────
// Problem  : 22. Generate Parentheses
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Backtracking, Bracket Sequences
// Link     : https://leetcode.com/problems/generate-parentheses/
// Runtime  : 1 ms (beats 86%)
// Memory   : 44204000 (beats 86%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution { 
    public List<String> generateParenthesis(int n) { 
        List<String> ans = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        dfs(n, n, cur, ans);
        return ans;
    }
    private void dfs(int open, int close, StringBuilder cur, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(cur.toString());
            return;
        }
        if (open > 0) {
            cur.append('(');
            dfs(open - 1, close, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close > open) {
            cur.append(')');
            dfs(open, close - 1, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}