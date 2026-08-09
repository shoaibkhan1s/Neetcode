class Solution {
HashMap<Integer,Integer> dp = new HashMap<>();
    public int climbStairs(int n) {
        return solve(n,0);    
    }
    private int solve(int n,int i){
        if(i>n){
            return 0;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        if(i==n){
            return 1;
        }
           int a = solve(n,i+1);
           int b = solve(n,i+2);
           int total = a+b;
           dp.put(i,total);
           return total;
        }
}
