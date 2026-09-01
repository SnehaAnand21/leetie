// ──────────────────────────────────────────────────
// Problem  : 796. Rotate String
// Difficulty: Easy
// Tags     : String, String Matching
// Link     : https://leetcode.com/problems/rotate-string/
// Runtime  : 2 ms (beats 65%)
// Memory   : 42960000 (beats 98%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}