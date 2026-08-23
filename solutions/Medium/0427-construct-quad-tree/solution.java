// ──────────────────────────────────────────────────
// Problem  : 427. Construct Quad Tree
// Difficulty: Medium
// Tags     : Array, Divide and Conquer, Tree, Matrix
// Link     : https://leetcode.com/problems/construct-quad-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46504000 (beats 67%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length);
    }

    private Node build(int[][] grid, int row, int col, int size) {

        if (isAllSame(grid, row, col, size)) {
            return new Node(grid[row][col] == 1, true);
        }

        int half = size / 2;

        Node root = new Node(true, false);

        root.topLeft = build(grid, row, col, half);
        root.topRight = build(grid, row, col + half, half);
        root.bottomLeft = build(grid, row + half, col, half);
        root.bottomRight = build(grid, row + half, col + half, half);

        return root;
    }

    private boolean isAllSame(int[][] grid, int row, int col, int size) {

        int value = grid[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (grid[i][j] != value) {
                    return false;
                }
            }
        }

        return true;
    }
}