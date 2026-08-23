// ──────────────────────────────────────────────────
// Problem  : 429. N-ary Tree Level Order Traversal
// Difficulty: Medium
// Tags     : Tree, Breadth-First Search
// Link     : https://leetcode.com/problems/n-ary-tree-level-order-traversal/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42800000 (beats 0%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            while(n-->0){
                Node node=q.poll();
                temp.add(node.val);

                for(Node child:node.children){
                    q.offer(child);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}