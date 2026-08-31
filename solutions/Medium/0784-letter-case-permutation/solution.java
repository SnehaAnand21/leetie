// ──────────────────────────────────────────────────
// Problem  : 784. Letter Case Permutation
// Difficulty: Medium
// Tags     : String, Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/letter-case-permutation/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47464000 (beats 42%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void backtrack(List<String> ans, StringBuilder sb, String s) {
        int n = sb.length();
        if (n == s.length()) {
            ans.add(sb.toString());
            return;
        }
        char c = s.charAt(n);
        if (Character.isDigit(s.charAt(n)))
            sb.append(c);
        else {
            sb.append(Character.toUpperCase(c));
            backtrack(ans, sb, s);
            sb.setLength(n);
            sb.append(Character.toLowerCase(c));
        }
        backtrack(ans, sb, s);
        sb.setLength(n);
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), s);
        return ans;
    }
}