// ──────────────────────────────────────────────────
// Problem  : 753. Cracking the Safe
// Difficulty: Hard
// Tags     : String, Depth-First Search, Graph Theory, Eulerian Circuit, Eulerian Path, Eulerian Graph
// Link     : https://leetcode.com/problems/cracking-the-safe/
// Runtime  : 3 ms (beats 0%)
// Memory   : 42072000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    Set<String> seen;
    StringBuilder ans;

    public String crackSafe(int n, int k) {
        if (n == 1 && k == 1) return "0";
        seen = new HashSet();
        ans = new StringBuilder();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; ++i)
            sb.append("0");
        String start = sb.toString();

        dfs(start, k);
        ans.append(start);
        return new String(ans);
    }

    public void dfs(String node, int k) {
        for (int x = 0; x < k; ++x) {
            String nei = node + x;
            if (!seen.contains(nei)) {
                seen.add(nei);
                dfs(nei.substring(1), k);
                ans.append(x);
            }
        }
    }
}