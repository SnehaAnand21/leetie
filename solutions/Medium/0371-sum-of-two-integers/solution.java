// ──────────────────────────────────────────────────
// Problem  : 371. Sum of Two Integers
// Difficulty: Medium
// Tags     : Math, Bit Manipulation
// Link     : https://leetcode.com/problems/sum-of-two-integers/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42068000 (beats 52%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}