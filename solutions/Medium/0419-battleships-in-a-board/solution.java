// ──────────────────────────────────────────────────
// Problem  : 419. Battleships in a Board
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Matrix
// Link     : https://leetcode.com/problems/battleships-in-a-board/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42440000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public void bfs(char[][] grid, int i, int j, boolean[][] isVisited){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        isVisited[i][j] = true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] d : dir){
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && !isVisited[x][y] && grid[x][y]=='X'){
                    q.offer(new int[]{x, y});
                    isVisited[x][y] = true;
                }
            }
        }
    }
    public int countBattleships(char[][] board) {
        // Exactly same question, Leetcode - 200 Number of Islands
        int m = board.length;
        int n = board[0].length;

        int count = 0; // total number of components
        boolean[][] isVisited = new boolean[m][n];
        for(int i=0; i<m; i++){ // O(m * n)
            for(int j=0; j<n; j++){
                if(!isVisited[i][j] && board[i][j]=='X'){
                    bfs(board, i, j, isVisited);
                    count++;
                }
            }
        }
        return count;
    }
}