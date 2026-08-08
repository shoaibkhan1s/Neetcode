class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
       }
       int[] indeg = new int[numCourses];
       Arrays.fill(indeg,0); 
       for(int[] edge : prerequisites){
        int u = edge[0];
        int v = edge[1];
        if(adj.get(v).contains(u)){
            return false;
        }
        adj.get(u).add(v);
        indeg[v]++;
       }
       Queue<Integer> q = new LinkedList<>();
       int[] vis = new int[numCourses];
       Arrays.fill(vis,0);
       for(int i=0;i<indeg.length;i++){
        if(indeg[i]==0){
            q.add(i);
        }
       }

       while(!q.isEmpty()){
        int node  = q.poll();
        vis[node] = 1;
        for(int ngbr:adj.get(node)){
            indeg[ngbr]--;
            if(indeg[ngbr]==0 && vis[ngbr]==0){
                q.add(ngbr);
            }
        }
       }
return true;
    }
}