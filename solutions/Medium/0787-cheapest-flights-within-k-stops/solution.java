// ──────────────────────────────────────────────────
// Problem  : 787. Cheapest Flights Within K Stops
// Difficulty: Medium
// Tags     : Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path
// Link     : https://leetcode.com/problems/cheapest-flights-within-k-stops/
// Runtime  : 6 ms (beats 86%)
// Memory   : 46756000 (beats 26%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(dp, n);
            for (int[] flight : flights) {
                if (dp[flight[0]] != Integer.MAX_VALUE) {
                    temp[flight[1]] = Math.min(temp[flight[1]], dp[flight[0]] + flight[2]);
                }
            }
            dp = temp;
        }
        
        return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
    }
}