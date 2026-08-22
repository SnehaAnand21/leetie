# ──────────────────────────────────────────────────
# Problem  : 332. Reconstruct Itinerary
# Difficulty: Hard
# Tags     : Array, String, Depth-First Search, Graph Theory, Sorting, Heap (Priority Queue), Eulerian Circuit, Eulerian Path, Semi-Eulerian Graph
# Link     : https://leetcode.com/problems/reconstruct-itinerary/
# Runtime  : 4 ms (beats 43%)
# Memory   : 19488000 (beats 84%)
# Language : python3
# Copyright: (c) 2026 SnehaAnand21. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

import collections

class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        # 1. Map airports to a Coordinate System (Numerical Mapping)
        # Sorting the unique airports ensures the matrix indices [0, 1, 2...] 
        # correspond to alphabetical order.
        airports = sorted(list(set(sum(tickets, []))))
        airport_to_idx = {name: i for i, name in enumerate(airports)}
        idx_to_airport = {i: name for i, name in enumerate(airports)}
        
        # 2. Build the Adjacency Representation (Simulated Sparse Matrix)
        # We use a list of lists where adj[i] contains the destination indices.
        # Sorting in reverse allows us to pop from the end (O(1)) for efficiency.
        n = len(airports)
        adj = [[] for _ in range(n)]
        for f, t in tickets:
            adj[airport_to_idx[f]].append(airport_to_idx[t])
            
        for row in adj:
            row.sort(reverse=True)
            
        # 3. Solve the Flow Path
        # We start at "JFK" and walk the graph, "draining" edges as we go.
        stack = [airport_to_idx["JFK"]]
        itinerary_indices = []
        
        while stack:
            curr = stack[-1]
            if adj[curr]:
                # Equivalent to adj_matrix[curr, next] -= 1
                next_node = adj[curr].pop()
                stack.append(next_node)
            else:
                # Post-order traversal captures the "Dummy Journey" logic:
                # If we hit a dead end, that must be the end of the itinerary.
                itinerary_indices.append(stack.pop())
                
        # 4. Map back to Strings
        # The result is found in reverse order due to the post-order DFS.
        return [idx_to_airport[i] for i in itinerary_indices[::-1]]        