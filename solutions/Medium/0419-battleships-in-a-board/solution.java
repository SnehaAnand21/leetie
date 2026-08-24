// ──────────────────────────────────────────────────
// Problem  : 419. Battleships in a Board
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Matrix
// Link     : https://leetcode.com/problems/battleships-in-a-board/
// Runtime  : 1 ms (beats 99%)
// Memory   : 45436000 (beats 69%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private int res = 0;
    private int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0) return 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    res++;
                    fun(board, i, j);
                }
            }
        }

        return res;
    }

    private void fun(char[][] board, int row, int col) {
        // Mark the current cell as visited by changing 'X' to 'R'
        board[row][col] = 'R';

        for (int x = 0; x < 4; x++) {
            int xRow = row + dir[x][0];
            int xCol = col + dir[x][1];

            // Check bounds and if the neighbor is part of the same ship
            if (xRow >= 0 && xRow < board.length && xCol >= 0 && xCol < board[0].length && board[xRow][xCol] == 'X') {
                fun(board, xRow, xCol);
            }
        }
    }
}