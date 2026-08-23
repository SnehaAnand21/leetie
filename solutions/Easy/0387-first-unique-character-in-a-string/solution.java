// ──────────────────────────────────────────────────
// Problem  : 387. First Unique Character in a String
// Difficulty: Easy
// Tags     : Hash Table, String, Queue, Counting
// Link     : https://leetcode.com/problems/first-unique-character-in-a-string/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42604000 (beats 0%)
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