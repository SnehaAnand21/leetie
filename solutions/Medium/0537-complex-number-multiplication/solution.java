// ──────────────────────────────────────────────────
// Problem  : 537. Complex Number Multiplication
// Difficulty: Medium
// Tags     : Math, String, Simulation
// Link     : https://leetcode.com/problems/complex-number-multiplication/
// Runtime  : 1 ms (beats 97%)
// Memory   : 42444000 (beats 95%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] x = parse(num1);
        int[] y = parse(num2);
        StringBuilder sb = new StringBuilder();
        sb.append(x[0] * y[0] - x[1] * y[1]);
        sb.append("+");
        sb.append(x[0] * y[1] + x[1] * y[0]);
        sb.append("i");
        return sb.toString();
    }

    int[] parse(String s) {
        String[] arr = s.split("\\+");
        int real = Integer.valueOf(arr[0]);
        int imag = Integer.valueOf(arr[1].substring(0, arr[1].length() - 1));
        return new int[] { real, imag };
    }
}