// ──────────────────────────────────────────────────
// Problem  : 780. Reaching Points
// Difficulty: Hard
// Tags     : Math, Euclidean Algorithm, Greatest Common Divisor
// Link     : https://leetcode.com/problems/reaching-points/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42436000 (beats 14%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx) {
                return (ty - sy) % tx == 0;
            }
            if (ty == sy) {
                return (tx - sx) % ty == 0;
            }
            if (ty > tx) {
                ty = ty % tx;
            } else {
                tx = tx % ty;
            }
        }
        return false;
    }
}