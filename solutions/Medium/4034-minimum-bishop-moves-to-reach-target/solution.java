// ──────────────────────────────────────────────────
// Problem  : 4034. Minimum Bishop Moves to Reach Target
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/minimum-bishop-moves-to-reach-target/
// Runtime  : 1 ms (beats 95%)
// Memory   : 44184000 (beats 51%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minBishopMoves(int[] source, int[] target) {

        if((source[0] + source[1]) % 2 != (target[0] + target[1]) % 2) return -1; //different color

        if(source[0] == target[0] && source[1] == target[1]) return 0; //in same cell
        
        if(source[0] + source[1] == target[0] + target[1]) return 1; // same diagonal (up to down)

        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])) return 1; //same diagonal (down to up)

        return 2;
    }
}
[8,1]
[1,8]
[4,2]
[1,3]
[1,1]
[3,4]
[8,1]
[1,8]
[4,2]
[1,3]
[1,1]
[3,4]
1
2
-1