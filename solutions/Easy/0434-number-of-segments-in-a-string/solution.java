// ──────────────────────────────────────────────────
// Problem  : 434. Number of Segments in a String
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/number-of-segments-in-a-string/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42676000 (beats 51%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countSegments(String s) {
    int t=0;
    int c=0;
    int n=s.length();
    for(int i=0;i<n;i++){
        if(s.charAt(i)!=' '&&t==0){
            c++;
            t=1;
        }
        if(s.charAt(i)==' ') t=0;
    
    }
    return c;
    }
}