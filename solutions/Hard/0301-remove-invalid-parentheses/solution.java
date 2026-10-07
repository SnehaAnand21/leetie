// ──────────────────────────────────────────────────
// Problem  : 301. Remove Invalid Parentheses
// Difficulty: Hard
// Tags     : String, Backtracking, Breadth-First Search
// Link     : https://leetcode.com/problems/remove-invalid-parentheses/
// Runtime  : 2 ms (beats 90%)
// Memory   : 43716000 (beats 92%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> answers = new ArrayList<>();
        remove(s, 0, 0, '(', ')', answers);
        return answers;
    }

    private void remove(
            String s,
            int scanStart,
            int deleteStart,
            char open,
            char close,
            List<String> answers) {
        int balance = 0;

        for (int i = scanStart; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == open) {
                balance++;
            } else if (c == close) {
                balance--;
            }

            if (balance >= 0) {
                continue;
            }

            for (int j = deleteStart; j <= i; j++) {
                if (s.charAt(j) == close
                        && (j == deleteStart
                                || s.charAt(j - 1) != close)) {
                    remove(
                            s.substring(0, j) + s.substring(j + 1),
                            i, j, open, close, answers);
                }
            }

            return;
        }

        String reversed = new StringBuilder(s).reverse().toString();

        if (open == '(') {
            remove(reversed, 0, 0, ')', '(', answers);
        } else {
            answers.add(reversed);
        }
    }
}