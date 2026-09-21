class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return Math.max(solve(nums,0,dp,true),solve(nums,1,dp,false));
    }
    private int solve(int[] nums,int i,int[] dp,boolean flag){
        if(i>=nums.length){
            return 0;
        }
    
        if(i==nums.length-1){
            if(flag){
                return 0;
            }else{
                return nums[i];
            }
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int a =  nums[i] + solve(nums,i+2,dp,flag);
        int b = nums[i] + solve(nums,i+3,dp,flag);
        return dp[i] = Math.max(a,b);

    }
}
