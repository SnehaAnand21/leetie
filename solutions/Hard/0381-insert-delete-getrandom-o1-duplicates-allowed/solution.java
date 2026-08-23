// ──────────────────────────────────────────────────
// Problem  : 381. Insert Delete GetRandom O(1) - Duplicates allowed
// Difficulty: Hard
// Tags     : Array, Hash Table, Math, Design, Randomized
// Link     : https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42824000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class RandomizedCollection {
    private List<Integer> list;
    private Map<Integer, Set<Integer>> map;
    private Random rand;

    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        // If the value doesn't exist yet, it's not present
        boolean notPresent = !map.containsKey(val);
        
        if (notPresent) {
            map.put(val, new LinkedHashSet<>());
        }
        
        map.get(val).add(list.size());
        list.add(val);
        
        return notPresent;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val) || map.get(val).isEmpty()) {
            return false;
        }
        
        // Get an arbitrary index of 'val' from its set of indices
        int removeIndex = map.get(val).iterator().next();
        int lastElement = list.get(list.size() - 1);
        
        // Swap the element to be removed with the last element in the list
        list.set(removeIndex, lastElement);
        
        // Update the indices in the hash map
        map.get(lastElement).add(removeIndex);
        map.get(lastElement).remove(list.size() - 1);
        
        // Remove the index of 'val' and clean up map if empty
        map.get(val).remove(removeIndex);
        if (map.get(val).isEmpty()) {
            map.remove(val);
        }
        
        // Remove the last element from the list
        list.remove(list.size() - 1);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}