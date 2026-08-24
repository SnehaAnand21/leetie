// ──────────────────────────────────────────────────
// Problem  : 459. Repeated Substring Pattern
// Difficulty: Easy
// Tags     : String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm
// Link     : https://leetcode.com/problems/repeated-substring-pattern/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42732000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    repeated.append(substring);
                }
                if (repeated.toString().equals(s)) return true;
            }
        }
        return false;
    }
}