class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[adj.size()];
        int count=0;
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }

    private void dfs(int node, List<List<Integer>> adj,boolean[] vis){
       vis[node] = true;

       for(int num : adj.get(node)){
        if(!vis[num]){
           dfs(num,adj,vis);
        }
       } 
    }
}
