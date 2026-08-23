// ──────────────────────────────────────────────────
// Problem  : 412. Fizz Buzz
// Difficulty: Easy
// Tags     : Math, String, Simulation
// Link     : https://leetcode.com/problems/fizz-buzz/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42484000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> fizzBuzz(int n) {
     List<String> list = new ArrayList<>();

        for(int i=1; i<n+1;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
              else if(i%5==0){
              list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;

    }
}