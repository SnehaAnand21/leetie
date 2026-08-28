// ──────────────────────────────────────────────────
// Problem  : 621. Task Scheduler
// Difficulty: Medium
// Tags     : Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
// Link     : https://leetcode.com/problems/task-scheduler/
// Runtime  : 4 ms (beats 73%)
// Memory   : 48176000 (beats 67%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25] - 1;
        int idle = chunk * n;

        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(chunk, freq[i]);
        }

        return idle < 0 ? tasks.length : tasks.length + idle;
    }
}