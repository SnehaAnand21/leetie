// ──────────────────────────────────────────────────
// Problem  : 575. Distribute Candies
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/distribute-candies/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42316000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (var i : candyType) 
            set.add(i);
        
        var n = candyType.length / 2;

        if (set.size() >= n) 
            return n;
        else 
            return set.size();
    }
}