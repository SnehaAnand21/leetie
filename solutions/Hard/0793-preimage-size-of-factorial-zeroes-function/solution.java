// ──────────────────────────────────────────────────
// Problem  : 793. Preimage Size of Factorial Zeroes Function
// Difficulty: Hard
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42160000 (beats 40%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int preimageSizeFZF(int k) {
        
        long low = 0;
        long high = (long)Math.pow(10,10);
        
        while(low<=high){
            long mid  = low + (high-low)/2;
            long val = mid;
            long ans = 0;
            while(val!=0){
                val/=5;
                ans+=val;
            }
            if(ans==k){
                return 5;
            }else if(ans>k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return 0;
    }
}