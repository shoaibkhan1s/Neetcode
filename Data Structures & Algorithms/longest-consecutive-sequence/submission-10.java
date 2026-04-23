class Solution {
   	 public static int longestConsecutive(int[] arr) {
     Set<Integer> set = new HashSet<>();
     for(int i =0;i<arr.length;i++){
        set.add(arr[i]);
     }
     int maxLen=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int curr = num;
                int len = 1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
        
    }
    
}
