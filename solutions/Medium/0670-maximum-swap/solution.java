// ──────────────────────────────────────────────────
// Problem  : 670. Maximum Swap
// Difficulty: Medium
// Tags     : Math, Greedy
// Link     : https://leetcode.com/problems/maximum-swap/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42080000 (beats 70%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumSwap(int num) {
        if(num < 12){
            return num;
        }
       
        int n[] = new int[9];
        int i = 0;
        int d = 0;
        while(num > 0){
            d = num % 10;
            num /= 10;
            n[i] = d;
            i++;
        }
        int maxi = 0;
        for(int j = i-1 ; j > 0 ; j--){
            if(n[j] == 9){
                continue;
            }
            maxi = j;
            for(int k = j-1 ; k >= 0 ; k--){
                
                if(n[maxi] <= n[k] && n[j] != n[k]){
                    maxi = k;
                }
            }
            if(maxi < j){
                int temp = n[maxi];
                n[maxi] = n[j];
                n[j] = temp;
                break;
            }
        }
        for(int j = i-1 ; j >= 0 ; j--){
            if(j == i-1){
                num = 0;
            }else{
                num *= 10;
            }
            num += n[j];
        }
        return num;
    }
}