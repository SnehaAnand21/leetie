// ──────────────────────────────────────────────────
// Problem  : 709. To Lower Case
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/to-lower-case/
// Runtime  : 2 ms (beats 0%)
// Memory   : 42708000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String toLowerCase(String s) {

        // Manual ASCII conversion

        String result = "";

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(65 <= ch && ch <= 90){
                result += (char)(ch + 32);
            }
            else{
                result += ch;
            }
        }

        return result;
    }
}