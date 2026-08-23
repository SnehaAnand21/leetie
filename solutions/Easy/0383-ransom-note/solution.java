// ──────────────────────────────────────────────────
// Problem  : 383. Ransom Note
// Difficulty: Easy
// Tags     : Hash Table, String, Counting
// Link     : https://leetcode.com/problems/ransom-note/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46216000 (beats 79%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Since characters consist of lowercase English letters, 
        // we can use a fixed-size frequency array instead of a HashMap for optimal speed.
        int[] charCount = new int[26];
        
        // Count each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Subtract requirements using the ransomNote characters
        for (char c : ransomNote.toCharArray()) {
            charCount[c - 'a']--;
            // If we run out of a character, we can't construct the ransom note
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}