class Solution {
   	 public static int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        if(arr.length==1){
            return 1;
        }
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        int k =1;
        for(int i = 0;i<arr.length;i++){
       if(i==0 && (arr[0]+1)==arr[1]){
           System.out.println(arr[i]);
                result.add(arr[0]);
       }
          else  if( arr[i]==(arr[i-1]+1)){
                System.out.println(arr[i]);
                result.add(arr[i]);
            }
           
        }
         System.out.println(result);
        return result.size() != 0 ?result.size():1 ;

        
    }
}
