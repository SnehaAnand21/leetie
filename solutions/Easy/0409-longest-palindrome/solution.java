// ──────────────────────────────────────────────────
// Problem  : 409. Longest Palindrome
// Difficulty: Easy
// Tags     : Hash Table, String, Greedy
// Link     : https://leetcode.com/problems/longest-palindrome/
// Runtime  : 1 ms (beats 100%)
// Memory   : 43008000 (beats 73%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestPalindrome(String s) {
        
        int n = s.length();

        int [] freq = new int[128];
  
    // freq count

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

   int ans = 0;

   boolean oddfound = false;
      
       // check every character freq

       for(int f : freq){
         
         if( f%2 == 0){
            ans +=f;
         }

         else{
             ans += f-1;
             oddfound = true;
         }
       }

       // one odd char will come in center

       if(oddfound){
        ans++;
       }

       return ans;

    }
}