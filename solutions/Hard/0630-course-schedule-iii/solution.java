// ──────────────────────────────────────────────────
// Problem  : 630. Course Schedule III
// Difficulty: Hard
// Tags     : Array, Greedy, Sorting, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/course-schedule-iii/
// Runtime  : 35 ms (beats 77%)
// Memory   : 54868000 (beats 87%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int scheduleCourse(int[][] courses) {
        int n = courses.length;
        Arrays.sort(courses, (a,b)->{
            if(a[1]==b[1])return a[0]-b[0];
            return a[1]-b[1];
        });

        int cnt=0;

        int curr=0;
        int dur=0;
        PriorityQueue<Integer>dura = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int i=0;i<courses.length;i++){
            if(curr+courses[i][0]<=courses[i][1]){
                cnt++;
                curr+=courses[i][0];
                dura.add(courses[i][0]);
            }
            else{
                if(!dura.isEmpty() && dura.peek() > courses[i][0] && curr-dura.peek()+courses[i][0]<=courses[i][1]){
                    curr-=dura.poll();
                    curr+=courses[i][0];
                    
                    dura.add(courses[i][0]);
                }
            }
            
        }
        

        return cnt;
    }
}