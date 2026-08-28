// ──────────────────────────────────────────────────
// Problem  : 558. Logical OR of Two Binary Grids Represented as Quad-Trees
// Difficulty: Medium
// Tags     : Divide and Conquer, Tree
// Link     : https://leetcode.com/problems/logical-or-of-two-binary-grids-represented-as-quad-trees/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47188000 (beats 28%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public Node intersect(Node x, Node y) {
        if (x.isLeaf) return x.val? x : y;
        if (y.isLeaf) return y.val? y : x;
        Node a = x.topLeft,
             b = x.topRight,
             c = x.bottomLeft,
             d = x.bottomRight;

        x.topLeft     = a = intersect(a, y.topLeft);
        x.topRight    = b = intersect(b, y.topRight);
        x.bottomLeft  = c = intersect(c, y.bottomLeft);
        x.bottomRight = d = intersect(d, y.bottomRight);

        if (a.isLeaf && b.isLeaf && c.isLeaf && d.isLeaf &&
            a.val == b.val && a.val == c.val && a.val == d.val){

            x.val = a.val;
            x.topLeft = x.topRight = x.bottomLeft = x.bottomRight = null;
            x.isLeaf = true;
        }

        return x;
    }
}