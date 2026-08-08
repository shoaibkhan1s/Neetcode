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
        if(u==v){
            return false;
        }
        if(adj.get(v).contains(u)){
            return false;
        }
        adj.get(u).add(v);
        indeg[v]++;
       }
       Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<indeg.length;i++){
        if(indeg[i]==0){
            q.add(i);
        }
       }
List<Integer> res = new ArrayList<>();
       while(!q.isEmpty()){
        int node  = q.poll();
        res.add(node);
        for(int ngbr:adj.get(node)){
            indeg[ngbr]--;
            if(indeg[ngbr]==0){
                q.add(ngbr);
            }
        }
       }
return res.size()>0;
    }
}