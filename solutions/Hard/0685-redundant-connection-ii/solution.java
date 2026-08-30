// ──────────────────────────────────────────────────
// Problem  : 685. Redundant Connection II
// Difficulty: Hard
// Tags     : Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
// Link     : https://leetcode.com/problems/redundant-connection-ii/
// Runtime  : 10 ms (beats 8%)
// Memory   : 46728000 (beats 8%)
// Language : java
// Copyright: (c) 2026 SnehaAnand21. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class DSU{
    static int par[];
    static int rank[];
    public DSU(int n){
        par=new int[n+1];
        rank=new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(par[x]!=x){
            par[x]=find(par[x]);
        }
        return par[x];
    }
    public static boolean union(int x,int y){
        int root1=find(x);
        int root2=find(y);
        if(root1==root2){
            return false;
        }
        if (rank[root1] < rank[root2]) {
            par[root1] = root2;
        } 
        else if (rank[root1] > rank[root2]) {
            par[root2] = root1;
        } 
        else {
            par[root2] = root1;
            rank[root1]++;
        }
       
        return true;
    }
}
class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n=edges.length;
        int v=0;
        for(int i=0;i<n;i++){
            v=Math.max(v,Math.max(edges[i][0],edges[i][1]));
        }
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(map);

        DSU dsu=new DSU(v);
        int first[]=new int[2];
        int sec[]=new int[2];
        int ind=0;
        for(ind=0;ind<edges.length;ind++){
            if(map.get(edges[ind][1]).size()>1){
                first=edges[ind];
                break;
            }
        }
        int skip=0;
        for(int i=ind+1;i<edges.length;i++){
            if(map.get(edges[i][1]).size()>1){
                sec=edges[i];
                skip=edges[i][1];
                edges[i][1]=0;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(edges[i][1]==0){
                continue;
            }
            if(!dsu.union(edges[i][0],edges[i][1])){
                if(first[0]==0 && first[1]==0){
                    return edges[i];
                }
                return first;
            }
        }
       sec[1]=skip;
       return sec; 
    }
}