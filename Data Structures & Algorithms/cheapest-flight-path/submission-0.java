class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] res = new int[n];
        int[] temp = new int[n];
        Arrays.fill(res,(int)1e8);
        Arrays.fill(temp,(int)1e8);
        res[src] = 0;
        for(int i=0;i<k+1;i++){
            for(int[] edge:flights){
                int s  = edge[0];
                int d = edge[1];
                int w   = edge[2];
                if(res[s] !=(int)1e8 && temp[d]>res[s] +w){
                    temp[d] = res[s] +w;
                }
            }
            res = temp.clone();
        }
        if(res[dst] == (int)1e8){
            return -1;
        }
        return res[dst];
    }
}