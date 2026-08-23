// ──────────────────────────────────────────────────
// Problem  : 386. Lexicographical Numbers
// Difficulty: Medium
// Tags     : Depth-First Search, Trie
// Link     : https://leetcode.com/problems/lexicographical-numbers/
// Runtime  : 2 ms (beats 87%)
// Memory   : 50248000 (beats 36%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<10;++i){
          dfs(i, n, res); 
        }
        return res;
    }
    
    public void dfs(int cur, int n, List<Integer> res){
        if(cur>n)
            return;
        else{
            res.add(cur);
            for(int i=0;i<10;++i){
                if(10*cur+i>n)
                    return;
                dfs(10*cur+i, n, res);
            }
        }
    }
}