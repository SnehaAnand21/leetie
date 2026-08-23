// ──────────────────────────────────────────────────
// Problem  : 344. Reverse String
// Difficulty: Easy
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/reverse-string/
// Runtime  : 0 ms (beats 100%)
// Memory   : 48088000 (beats 89%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void reverseString(char[] s) {
       int left=0;int right=s.length-1;
       while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;left++;right--;
       } 
    }
}