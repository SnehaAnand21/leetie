// ──────────────────────────────────────────────────
// Problem  : 648. Replace Words
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Trie
// Link     : https://leetcode.com/problems/replace-words/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42576000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class TrieNode {
    boolean isLastLetterOfWord;
    TrieNode[] children;
    
    
    public TrieNode() {
        this.isLastLetterOfWord = false;
        this.children = new TrieNode[26];
    }
}


class Solution {
    TrieNode root;
    
    
    public void insertInTrie(String word) {
        TrieNode n = this.root;
        TrieNode[] children = n.children;
        
        
        for (char letter : word.toCharArray()) {
            int idx = (int) letter - 97;
            
            
            if (children[idx] == null)
                children[idx] = new TrieNode();
            
            
            n = children[idx];
            children = n.children;
        }
        
        
        n.isLastLetterOfWord = true;
    }
    
    
    public String getReplacement(String word) {
        TrieNode n = this.root;
        TrieNode[] children = n.children;
        int l = word.length();
        
        
        for (int i = 0; i < l; i++) {
            if (n.isLastLetterOfWord)
                return word.substring(0, i);
            
            
            int idx = (int) word.charAt(i) - 97;
            
            
            if (children[idx] == null)
                break;
            
            
            n = children[idx];
            children = n.children;
        }
        
        
        return word;
    }
    
    
    public String replaceWords(List<String> dictionary, String sentence) {
        this.root = new TrieNode();
        String[] words = sentence.split(" ");
        
        
        for (String word : dictionary)
            insertInTrie(word);
        
        
        for (int i = 0; i < words.length; i++)
            words[i] = getReplacement(words[i]);
        
        
        return String.join(" ", words);
    }
}