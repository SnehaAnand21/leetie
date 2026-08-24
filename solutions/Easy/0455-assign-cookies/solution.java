// ──────────────────────────────────────────────────
// Problem  : 455. Assign Cookies
// Difficulty: Easy
// Tags     : Array, Two Pointers, Greedy, Sorting, Quicksort
// Link     : https://leetcode.com/problems/assign-cookies/
// Runtime  : 12 ms (beats 99%)
// Memory   : 50524000 (beats 100%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int m = g.length - 1;
        int n = s.length - 1;
        sort(g, i, m);
        sort(s, j, n);
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

    void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}