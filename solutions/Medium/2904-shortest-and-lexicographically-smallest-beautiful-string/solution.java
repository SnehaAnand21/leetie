// ──────────────────────────────────────────────────
// Problem  : 2904. Shortest and Lexicographically Smallest Beautiful String
// Difficulty: Medium
// Tags     : String, Sliding Window
// Link     : https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44048000 (beats 58%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String ans = "";
        int left = 0, count = 0;
        int minLen = n + 1;

        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                count++;
            }

            while (count == k) {
                String sub = s.substring(left, right + 1);
                int len = sub.length();

                if (len < minLen) {
                    minLen = len;
                    ans = sub;
                } else if (len == minLen) {
                    if (ans.equals("") || sub.compareTo(ans) < 0) {
                        ans = sub;
                    }
                }

                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }

        return ans;
    }
}