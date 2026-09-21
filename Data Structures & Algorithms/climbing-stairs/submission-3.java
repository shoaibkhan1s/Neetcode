class Solution {
        int count = 0;
    public int climbStairs(int n) {
        int[] dp = new int[n];
        solve(n,0);
        return count;
    }
    private void solve(int n,int i){
        if(i==n){
            count++;
            return;
        }
        if(i>n){
            return;
        }
        solve(n,i+1);
        solve(n,i+2);
        return;
    }
}
