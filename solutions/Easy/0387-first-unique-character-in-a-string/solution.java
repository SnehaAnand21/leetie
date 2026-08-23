// ──────────────────────────────────────────────────
// Problem  : 387. First Unique Character in a String
// Difficulty: Easy
// Tags     : Hash Table, String, Queue, Counting
// Link     : https://leetcode.com/problems/first-unique-character-in-a-string/
// Runtime  : 25 ms (beats 49%)
// Memory   : 47156000 (beats 24%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char count=s.charAt(i);
            if(s.indexOf(count)==s.lastIndexOf(count)){
                return i;
            }
        }
        return -1;
    }
}