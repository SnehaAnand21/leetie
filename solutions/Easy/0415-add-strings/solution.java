// ──────────────────────────────────────────────────
// Problem  : 415. Add Strings
// Difficulty: Easy
// Tags     : Math, String, Simulation
// Link     : https://leetcode.com/problems/add-strings/
// Runtime  : 2 ms (beats 97%)
// Memory   : 43788000 (beats 77%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            sb.append(sum%10);
            carry=sum/10;
        }
       return sb.reverse().toString();
    } 
}