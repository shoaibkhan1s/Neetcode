class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        
        return solve(n,0);
        
    }
    private int solve(int n,int i){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        int a = solve(n,i+1);
        int b = solve(n,i+2);
        int total = a+b;
        map.put(i,total);
        return total;
    }
}
