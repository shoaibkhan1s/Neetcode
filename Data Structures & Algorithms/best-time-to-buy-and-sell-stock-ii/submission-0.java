class Solution {
    public int maxProfit(int[] prices) {
         int[][] dp = new int[prices.length+1][3];
        for(int[] x :dp){
            Arrays.fill(x,-1);
        }
        return solve(prices,0,1,dp);
    }
    private int solve(int[] prices,int i,int k,int[][] dp){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][k]!=-1){
            return dp[i][k];
        }
        if(k==1){
            int c1 = solve(prices,i+1,1-k,dp) -prices[i];
            int c2 = solve(prices,i+1,k,dp);
            return dp[i][k] = Math.max(c1,c2);
        }else{
            int c1 = solve(prices,i+1,1-k,dp) +prices[i];
            int c2 = solve(prices,i+1,k,dp);
            return dp[i][k] = Math.max(c1,c2); 
        }
    }
}