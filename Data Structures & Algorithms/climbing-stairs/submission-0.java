class Solution {

    public int climbStairs(int n) {
        return solve(n,0);    
    }
    private int solve(int n,int i){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
           int a = solve(n,i+1);
           int b = solve(n,i+2);
           return a+b;
        }
}
