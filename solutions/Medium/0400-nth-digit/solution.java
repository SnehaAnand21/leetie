// ──────────────────────────────────────────────────
// Problem  : 400. Nth Digit
// Difficulty: Medium
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/nth-digit/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42336000 (beats 7%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findNthDigit(int n) {
        long len=1,c=9,s=1;
        while(n>len*c){
        n-=len*c;
        len++;
        c*=10;
        s*=10;

    }
    s+=(n-1)/len;
    return String.valueOf(s).charAt((n-1)%(int)len)- '0';
}
}