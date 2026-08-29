// ──────────────────────────────────────────────────
// Problem  : 645. Set Mismatch
// Difficulty: Easy
// Tags     : Array, Hash Table, Bit Manipulation, Sorting
// Link     : https://leetcode.com/problems/set-mismatch/
// Runtime  : 762 ms (beats 5%)
// Memory   : 47248000 (beats 94%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────



class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        
        return new int[] {dup, missing};
    }
}
