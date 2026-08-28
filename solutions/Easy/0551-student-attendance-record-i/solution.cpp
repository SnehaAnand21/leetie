// ──────────────────────────────────────────────────
// Problem  : 551. Student Attendance Record I
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/student-attendance-record-i/
// Runtime  : 0 ms (beats 0%)
// Memory   : 7700000 (beats 0%)
// Language : cpp
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution { // Author:- KaiHiwatari.
public:
    bool checkRecord(string s) {
        int absentcount = 0;
        int latecount = 0;
        int consecutivelatecount = 0;
        for(int i=0;i<s.size();i++){
            if(s[i] == 'A'){
                absentcount += 1;
            }
            if(s[i] == 'L'){
                latecount += 1;
                consecutivelatecount = max(latecount,consecutivelatecount); 
            }else{
                latecount = 0;
            }
        }
        if (absentcount < 2 && consecutivelatecount < 3){
            return true;
        }else{
            return false;
        }
    }
};