// ──────────────────────────────────────────────────
// Problem  : 605. Can Place Flowers
// Difficulty: Easy
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/can-place-flowers/
// Runtime  : 1 ms (beats 99%)
// Memory   : 47800000 (beats 56%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedSize = flowerbed.length;
        for (int i = 0; i < flowerbedSize && n > 0; i++) {
            boolean prev = i == 0 || flowerbed[i - 1] == 0;
            boolean fut = i == flowerbedSize - 1 || flowerbed[i + 1] == 0;
            if (prev && fut && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}