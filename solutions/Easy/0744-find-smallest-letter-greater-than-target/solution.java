// ──────────────────────────────────────────────────
// Problem  : 744. Find Smallest Letter Greater Than Target
// Difficulty: Easy
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42484000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0 ;
        int right = letters.length - 1 ;
        char ans = letters[0] ;
        while(left <= right){
            int mid = left + (right - left) / 2 ;

            if(letters[mid] > target){
                ans = letters[mid] ;
                right = mid - 1 ;
            }else{
                left = mid + 1 ;
            }
        }
        return ans ;
    }
}