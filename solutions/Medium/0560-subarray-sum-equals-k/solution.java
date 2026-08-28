// ──────────────────────────────────────────────────
// Problem  : 560. Subarray Sum Equals K
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// Link     : https://leetcode.com/problems/subarray-sum-equals-k/
// Runtime  : 24 ms (beats 76%)
// Memory   : 48604000 (beats 71%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap will store all the prefixSum upto the index <Sum, Frequency>
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int prefixSum = 0; // Actual Sum upto the Index
        
        // If prefixSum - k = 0, it means the subarray starts from index 0.
        // We add (0, 1) to handle this case naturally.
        hm.put(0, 1); 

        int noOfSubArrayPossible = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];               // Accumulate sum
            
            int remove = prefixSum - k;         // Calculate what previous sum we need to chop off
            
            // If HashMap contains the exact prefixSum to remove, it means we found valid subarrays
            if(hm.containsKey(remove)){         
                noOfSubArrayPossible += hm.get(remove);
            }
            
            // Store/Update the current prefixSum frequency in the map
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1); 
        }
        return noOfSubArrayPossible;
    }
}