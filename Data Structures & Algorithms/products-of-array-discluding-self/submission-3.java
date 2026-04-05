class Solution {
    public int[] productExceptSelf(int[] arr) {
      
int prod=1;
int k =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){ 
               k++;
            }else{
            prod *= arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(k>1){
                arr[i] = 0;
            }
          else if(k==1){
              if(arr[i] == 0){
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            }
            else{
            arr[i] = prod/arr[i];
            }
        }
        return arr;
    }
}  
