// ──────────────────────────────────────────────────
// Problem  : 655. Print Binary Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/print-binary-tree/
// Runtime  : 1 ms (beats 100%)
// Memory   : 45420000 (beats 9%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int depth = findDepth(root);
        int width = (2 << depth-1) - 1;

        List<String> protolist = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            protolist.add("");
        }

        List<List<String>> ans = new ArrayList<>();

        Deque<ParentPos> q = new ArrayDeque<>();
        q.add(new ParentPos(root, width / 2));

        int level = 0;
        while (! q.isEmpty()) {
            level ++;
            int spread = (width + 1) / (1 << (level + 1));

            int toCheck = q.size();
            List<String> nextList = new ArrayList<>(protolist);
            for (int i = 0; i < toCheck; i++) {
                ParentPos pp = q.poll();
                int pos = pp.pos;
                TreeNode node = pp.node;
                nextList.set(pos, Integer.toString(node.val));
                if (node.left != null) {
                    q.add(new ParentPos(node.left, pos - spread));
                }
                if (node.right != null) {
                    q.add(new ParentPos(node.right, pos + spread));
                }
            }
            ans.add(nextList);
        }

        return ans;
    }

    private record ParentPos(TreeNode node, int pos) {}

    private int findDepth(TreeNode node) {
        return node == null ? 0 : 1 + Math.max(findDepth(node.left), findDepth(node.right));
    }
}