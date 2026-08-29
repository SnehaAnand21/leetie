// ──────────────────────────────────────────────────
// Problem  : 677. Map Sum Pairs
// Difficulty: Medium
// Tags     : Hash Table, String, Design, Trie
// Link     : https://leetcode.com/problems/map-sum-pairs/
// Runtime  : 9 ms (beats 63%)
// Memory   : 43800000 (beats 72%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MapSum {
    Map<String,Integer> map;
    Map<String,Integer> original;
    public MapSum() {
        map=new HashMap<>();
        original=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        int a=val;
        if(original.containsKey(key)) {
            val-=original.get(key);
        }
        original.put(key,a);
        for(int i=0;i<key.length();i++){
            String x=key.substring(0,i+1);
            map.put(x,map.getOrDefault(x,0)+val);
        }
    }
    
    public int sum(String prefix) {
        if(map.containsKey(prefix))
            return map.get(prefix);
        else return 0;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */