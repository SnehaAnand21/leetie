// ──────────────────────────────────────────────────
// Problem  : 606. Construct String from Binary Tree
// Difficulty: Medium
// Tags     : String, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/construct-string-from-binary-tree/
// Runtime  : 2 ms (beats 86%)
// Memory   : 46228000 (beats 89%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    StringBuilder sb;
    private void doEv(TreeNode root){
        if(root == null)return;
        if(root.left == null && root.right==null){
            sb.append(root.val);
            return;
        }
        sb.append(root.val);
        sb.append('(');
        doEv(root.left);
        sb.append(')');
        if(root.right!=null){
        sb.append('(');
        doEv(root.right);
        sb.append(')');
        }
        return;
    }
    public String tree2str(TreeNode t) {
        sb = new StringBuilder();
        doEv(t);
        return sb.toString();
    }
}