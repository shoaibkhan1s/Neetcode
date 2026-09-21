class Solution {
    public int rob(int[] cost) {
        int n = cost.length;
        if(n==1){
            return cost[0];
        }
     int[] p = new int[n];
     p[0] = cost[0];
     p[1] = Math.max(cost[0],cost[1]);
     for(int i=2;i<cost.length;i++){
        p[i] = Math.max(p[i-1],cost[i]+p[i-2]);
     }
     return p[n-1];
    }
}
