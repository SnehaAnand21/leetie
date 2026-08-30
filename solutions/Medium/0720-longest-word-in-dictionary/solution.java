// ──────────────────────────────────────────────────
// Problem  : 720. Longest Word in Dictionary
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Trie, Sorting
// Link     : https://leetcode.com/problems/longest-word-in-dictionary/
// Runtime  : 17 ms (beats 48%)
// Memory   : 46664000 (beats 62%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        
        Set<String> st = new HashSet<>();
        st.add("");
        String longest = "";
        
        for (String word : words) {
            String prefix = word.substring(0, word.length() - 1);
            
            if (st.contains(prefix)) {
                st.add(word);
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }
        
        return longest;
    }
}