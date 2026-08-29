// ──────────────────────────────────────────────────
// Problem  : 657. Robot Return to Origin
// Difficulty: Easy
// Tags     : String, Simulation
// Link     : https://leetcode.com/problems/robot-return-to-origin/
// Runtime  : 4 ms (beats 99%)
// Memory   : 46312000 (beats 10%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char m : moves.toCharArray()) {
            if (m == 'R') x++;
            else if (m == 'L') x--;
            else if (m == 'U') y++;
            else if (m == 'D') y--;
        }
        return x == 0 && y == 0;
    }
}