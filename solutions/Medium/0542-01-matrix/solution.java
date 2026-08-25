// ──────────────────────────────────────────────────
// Problem  : 542. 01 Matrix
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Breadth-First Search, Matrix
// Link     : https://leetcode.com/problems/01-matrix/
// Runtime  : 16 ms (beats 28%)
// Memory   : 49336000 (beats 36%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int[][] res=new int[m][n];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    res[i][j]=0;
                    q.offer(new int[]{i,j});
                }
                else res[i][j]=-1;
            }
        }
        int[][]dirs={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]idx=q.poll();
            int i=idx[0],j=idx[1];
            for(int[]dir:dirs){
                int r=i+dir[0];
                int c=j+dir[1];
                if(r >= 0 && r < m && c >= 0 && c < n && res[r][c] == -1){
                    res[r][c]=res[i][j]+1;
                    q.offer(new int[]{r,c});
                }
            }
        }
        return res;
    }
}