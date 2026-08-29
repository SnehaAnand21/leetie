// ──────────────────────────────────────────────────
// Problem  : 624. Maximum Distance in Arrays
// Difficulty: Medium
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/maximum-distance-in-arrays/
// Runtime  : 9 ms (beats 47%)
// Memory   : 142916000 (beats 78%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────


class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);

            // Calculate distance using current min and max with other arrays
            maxDistance = Math.max(maxDistance, Math.max(
                Math.abs(currentArray.get(currentArray.size() - 1) - minVal),
                Math.abs(maxVal - currentArray.get(0))
            ));

            // Update the global min and max values
            minVal = Math.min(minVal, currentArray.get(0));
            maxVal = Math.max(maxVal, currentArray.get(currentArray.size() - 1));
        }

        return maxDistance;
    }
}