// ──────────────────────────────────────────────────
// Problem  : 414. Third Maximum Number
// Difficulty: Easy
// Tags     : Array, Sorting
// Link     : https://leetcode.com/problems/third-maximum-number/
// Runtime  : 1 ms (beats 99%)
// Memory   : 44476000 (beats 95%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int thirdMax(int[] nums) {
       long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
           
            if (num == max1 || num == max2 || num == max3) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        // If third max doesn't exist, return the largest
        return (max3 == Long.MIN_VALUE) ? (int) max1 : (int) max3;

    }
}