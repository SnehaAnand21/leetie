// ──────────────────────────────────────────────────
// Problem  : 765. Couples Holding Hands
// Difficulty: Hard
// Tags     : Greedy, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
// Link     : https://leetcode.com/problems/couples-holding-hands/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42744000 (beats 75%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

// Java
class Solution {
    public int minSwapsCouples(int[] row) {
        int swaps = 0;
        int n = row.length;
        int[] position = new int[n];

        // Map each person to their seat index
        for (int i = 0; i < n; i++) {
            position[row[i]] = i;
        }

        // Process pairs of seats
        for (int i = 0; i < n; i += 2) {
            int first = row[i];
            int second = row[i + 1];
            int expectedSecond = first ^ 1; // Partner of first person

            if (second != expectedSecond) {
                swaps++;
                int partnerIndex = position[expectedSecond];

                // Swap second person with the correct partner
                swap(row, i + 1, partnerIndex);

                // Update position map after swap
                position[second] = partnerIndex;
                position[expectedSecond] = i + 1;
            }
        }
        return swaps;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}