// ──────────────────────────────────────────────────
// Problem  : 440. K-th Smallest in Lexicographical Order
// Difficulty: Hard
// Tags     : Trie
// Link     : https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/
// Runtime  : 0 ms (beats 0%)
// Memory   : 41716000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int getReqNum(long a, long b, long n) {
        int gap = 0;
        while (a <= n) {
            gap += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }
        return gap;
    }

    public int findKthNumber(int n, int k) {
        long num = 1;
        for (int i = 1; i < k;) {
            int req = getReqNum(num, num + 1, n);
            if (i + req <= k) {
                i += req;
                num++;
            } else {
                i++;
                num *= 10;
            }
        }
        return (int) num;
    }
}