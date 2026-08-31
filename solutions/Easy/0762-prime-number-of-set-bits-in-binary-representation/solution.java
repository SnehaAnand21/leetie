// ──────────────────────────────────────────────────
// Problem  : 762. Prime Number of Set Bits in Binary Representation
// Difficulty: Easy
// Tags     : Math, Bit Manipulation, Primality Test
// Link     : https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
// Runtime  : 0 ms (beats 0%)
// Memory   : 41868000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++){
            int bits = countBit(i);
            if(isPrime(bits)) res++;
        }
        return res;
    }

    // counting 1's
    private static int countBit(int n){
        int count = 0;
        while(n > 0){
            int bit = n % 2;
            if(bit == 1) count++;
            n /= 2;
        }
        return count;
    }

    // checking whether prime or not
    private static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    } 
}