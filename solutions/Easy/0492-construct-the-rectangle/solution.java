// ──────────────────────────────────────────────────
// Problem  : 492. Construct the Rectangle
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/construct-the-rectangle/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42296000 (beats 84%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] constructRectangle(int area) {
         int[] ans = new int[2];
        for (int i = (int)(Math.sqrt(area)); i >= 1 ; i--) {
            if (area % i == 0) {
                ans[1] = i;
                ans[0] = area / i;
                break;
            }
        }
        return ans;
    }
}