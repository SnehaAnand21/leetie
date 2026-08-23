// ──────────────────────────────────────────────────
// Problem  : 401. Binary Watch
// Difficulty: Easy
// Tags     : Backtracking, Bit Manipulation
// Link     : https://leetcode.com/problems/binary-watch/
// Runtime  : 6 ms (beats 69%)
// Memory   : 49272000 (beats 44%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> readBinaryWatch(int k) {
        if (k == 0) return List.of("0:00"); 
        if (k >= 9) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        int mask = (1 << 6) - 1, q = (1 << k) - 1, limit = q << (10 - k);

        while (q <= limit) {
            int minute = q & mask, hour = q >> 6;
            is_valid(minute, hour, res);
            int r = q & -q, n = q + r;
            q = (((q ^ n) / r) >> 2) | n;
        }

        return res;
    }

    public void is_valid(int minute, int hour, List<String> res) {
        if (hour <= 11 && minute <= 59) {
            res.add(hour + ":" + (minute < 10 ? "0" : "") + minute);
        }
    }
}