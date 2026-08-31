// ──────────────────────────────────────────────────
// Problem  : 785. Is Graph Bipartite?
// Difficulty: Medium
// Tags     : Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Graph Coloring, Bipartite Graph
// Link     : https://leetcode.com/problems/is-graph-bipartite/
// Runtime  : 1 ms (beats 63%)
// Memory   : 47304000 (beats 20%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isBipartite(int[][] graph) {

        int vertices = graph.length;

        // -1 -> unvisited
        // 0 and 1 -> the two colors
        int[] color = new int[vertices];
        Arrays.fill(color, -1);

        // Handle disconnected components
        for (int i = 0; i < vertices; i++) {
            if (color[i] == -1) {
                if (!bfs(i, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int start, int[][] graph, int[] color) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        // Assign the first color to the starting node
        color[start] = 0;

        while (!q.isEmpty()) {

            int curr = q.poll();

            // Visit all adjacent nodes
            for (int neighbor : graph[curr]) {

                // If the neighbor is unvisited,
                // assign it the opposite color
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[curr];
                    q.offer(neighbor);
                }

                // Adjacent nodes have the same color
                else if (color[neighbor] == color[curr]) {
                    return false;
                }
            }
        }

        return true;
    }
}