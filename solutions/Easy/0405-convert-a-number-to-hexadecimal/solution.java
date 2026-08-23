// ──────────────────────────────────────────────────
// Problem  : 405. Convert a Number to Hexadecimal
// Difficulty: Easy
// Tags     : Math, String, Bit Manipulation
// Link     : https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42432000 (beats 80%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int digit = num & 15;
            sb.append(calculate(digit));
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }

    char calculate(int digit) {
        if (digit == 10)
            return 'a';
        else if (digit == 11)
            return 'b';
        else if (digit == 12)
            return 'c';
        else if (digit == 13)
            return 'd';
        else if (digit == 14)
            return 'e';
        else if (digit == 15)
            return 'f';
        else
            return (char) ('0' + digit);
    }
}