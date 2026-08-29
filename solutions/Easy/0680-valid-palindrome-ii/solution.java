// ──────────────────────────────────────────────────
// Problem  : 680. Valid Palindrome II
// Difficulty: Easy
// Tags     : Two Pointers, String, Greedy
// Link     : https://leetcode.com/problems/valid-palindrome-ii/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42252000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean validPalindrome(String s) {
        int i=0, e=s.length()-1;
        //Check for first pointer where characters are not equal and break the loop
        while(i<e) {
            if(s.charAt(i)==s.charAt(e)) {
                i++;
                e--;
            }else {
                break;
            }
        }
        if(i>=e) {
            return true; //If you found no point of error just return true
        }
        if(!Palindrome(i,e-1, s)) { //Check again palindrome by removing character at end
            return Palindrome(i+1,e, s); //If it fails check palindrome by removing character at start
        }
        return true; //If removing from end works just return true
    }
    // Function for checking palindrome -
    private boolean Palindrome(int i, int e, String s) {
        while(i<e) {
            if(s.charAt(i)==s.charAt(e)) {
                i++;
                e--;
            }else {
                return false;
            }
        }
        return true;
    }
}