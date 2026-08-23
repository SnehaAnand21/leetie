// ──────────────────────────────────────────────────
// Problem  : 412. Fizz Buzz
// Difficulty: Easy
// Tags     : Math, String, Simulation
// Link     : https://leetcode.com/problems/fizz-buzz/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46676000 (beats 84%)
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