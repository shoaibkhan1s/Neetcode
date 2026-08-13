class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n= text1.length();
        int m= text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return solve(0,0,n,m,text1,text2,dp);
    }
    private int solve(int i,int j,int n, int m,String text1,String text2,int[][] dp){
        if(i==n || j==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j] = 1+solve(i+1,j+1,n,m,text1,text2,dp);
        }
        int c1 = solve(i+1,j,n,m,text1,text2,dp);
        int c2 = solve(i,j+1,n,m,text1,text2,dp);
        return dp[i][j] = Math.max(c1,c2);
    }
}