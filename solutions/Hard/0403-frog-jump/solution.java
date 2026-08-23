// ──────────────────────────────────────────────────
// Problem  : 403. Frog Jump
// Difficulty: Hard
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/frog-jump/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42812000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canCross(int[] stones) {
        Map<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int s:stones)map.put(s,new HashSet<>());
        map.get(0).add(0);
        for(int s:stones){
            for(int x:map.get(s)){
                for(int i=x-1;i<=x+1;i++){
                    if(i>0 && map.containsKey(s+i))map.get(s+i).add(i);
                }
            }
        }
        return !map.get(stones[stones.length-1]).isEmpty();
    }
}


// easy way
// At every stone store the number of ways to react that ( i.e store lenghts)
// first iterate in stones
// next get the lengths to reach that stone
// iterate over length with -1,0,+1 and set the future stone possiblities in map
// if last stone dont have any ways to reach then its emoty