// ──────────────────────────────────────────────────
// Problem  : 541. Reverse String II
// Difficulty: Easy
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/reverse-string-ii/
// Runtime  : 2 ms (beats 14%)
// Memory   : 44888000 (beats 45%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}