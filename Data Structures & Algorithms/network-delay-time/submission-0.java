class Solution {
    public int networkDelayTime(int[][] edges, int V, int k) {
     ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<V;i++){
            res.add(Integer.MAX_VALUE);
        }
        res.set(k-1,0);
        
        for(int i=0;i<V-1;i++){
            for(int j=0;j<edges.length;j++){
                int s = edges[j][0];
                int d = edges[j][1];
                int w = edges[j][2];
                
                if(res.get(s-1)!=Integer.MAX_VALUE && res.get(d-1)>w+res.get(s-1)){
                    res.set(d-1,w+res.get(s-1));
                }
            }
            
        }
        for(int j=0;j<edges.length;j++){
            int s = edges[j][0];
            int d = edges[j][1];
            int w = edges[j][2];
            if(res.get(s-1) != Integer.MAX_VALUE && res.get(d-1)>w+res.get(s-1)){
                return -1;
            }
        }
        int max  = Integer.MIN_VALUE;
        for(int num:res){
            max = Math.max(max,num);
        }
        return max!=Integer.MAX_VALUE ? max : -1;
    }
}