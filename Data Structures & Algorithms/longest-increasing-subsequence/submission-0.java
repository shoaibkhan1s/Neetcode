class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] res = new int[n+1];
        for(int i=0;i<n;i++){  
            res[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    res[i] = Math.max(res[i],res[j]+1);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int num : res){
            ans = Math.max(ans,num);
        }
return ans;
    }
}